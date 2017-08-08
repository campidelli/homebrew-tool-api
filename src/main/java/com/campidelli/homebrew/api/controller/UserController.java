package com.campidelli.homebrew.api.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.campidelli.homebrew.api.model.user.User;
import com.campidelli.homebrew.api.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * RESTful controller to perform operations regarding users.
 * @author campidelli
 */
@RestController
public class UserController {

  @Autowired
  UserService userService;

  @ApiOperation(notes = "Creates an user", value = "Create user", nickname = "createUser",
      tags = { "users" })
  @ApiResponses({ @ApiResponse(code = 201, message = "Successfully created", response = User.class),
      @ApiResponse(code = 400, message = "Invalid user data or duplicate", response = ApiResponse.class) })
  @RequestMapping(value = "/users", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
  public ResponseEntity<Object> createUser(@ApiParam(value = "User data", required = true) @RequestBody User user)
      throws URISyntaxException {

    if (user == null) {
      return ResponseEntity.badRequest().body("User input data must not be null.");
    }

    if (user.getId() != null) {
      return ResponseEntity.badRequest().body("User ID must be null.");
    }

    User createdUser = userService.save(user);
    URI uri = new URI("users/" + user.getId());
    return ResponseEntity.created(uri).body(createdUser);
  }

  @ApiOperation(notes = "Returns an user based on a given ID", value = "Find user by ID", nickname = "getUserById",
      tags = { "users" })
  @ApiResponses({ @ApiResponse(code = 200, message = "Successful operation", response = User.class),
      @ApiResponse(code = 400, message = "Invalid ID supplied", response = ApiResponse.class),
      @ApiResponse(code = 404, message = "User not found", response = ApiResponse.class) })
  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = "application/json")
  public ResponseEntity<Object> getUserById(
      @ApiParam(value = "ID of user that needs to be fetched", required = true) @PathVariable("id") String userId)
      throws Exception {

    if (userId == null || userId.isEmpty()) {
      return ResponseEntity.badRequest().body("Invalid User ID [" + userId + "]");
    }

    User user = userService.getUserById(userId);
    if (user != null) {
      return ResponseEntity.ok().body(user);
    }

    return ResponseEntity.notFound().build();
  }
}
