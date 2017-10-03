package com.theironyard.springsecuritydemo.repository;

import com.theironyard.springsecuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by doug on 10/3/17.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
