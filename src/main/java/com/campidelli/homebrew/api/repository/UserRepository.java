package com.campidelli.homebrew.api.repository;

import com.campidelli.homebrew.api.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository to persist and retrieve users.
 * @author campidelli
 */
public interface UserRepository extends MongoRepository<User, String> {

}
