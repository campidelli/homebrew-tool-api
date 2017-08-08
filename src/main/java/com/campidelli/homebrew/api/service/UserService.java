package com.campidelli.homebrew.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.campidelli.homebrew.api.model.user.User;
import com.campidelli.homebrew.api.repository.UserRepository;

/**
 * Contains all operations related to users.
 * @author campidelli
 */
@Component
public class UserService {

  @Autowired
  private UserRepository repository;

  public User getUserById(String id) {
    return repository.findOne(id);        
  }

  public User save(User user) {
    return repository.save(user);
  }
}
