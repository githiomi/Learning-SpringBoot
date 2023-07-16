package com.dhosiolux.springintro.services;

/*
 *
 * @created: 01-07-2023 --- 3:07 PM
 * @project: Learning Springboot
 * @author: Daniel Githiomi
 *
 */

import com.dhosiolux.springintro.models.Gender;
import com.dhosiolux.springintro.models.User;
import com.dhosiolux.springintro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // Inject the repository
    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    // Method to get a single user
    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
