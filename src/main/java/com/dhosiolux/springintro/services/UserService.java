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

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    // Inject the repository
    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Method to get a single user
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        user.setAge(getCurrentAge(user.getDob()));
        return userRepository.save(user);
    }

    // Method to calculate the age of the user
    public int getCurrentAge(LocalDate dob) {

        // compare months
        if (LocalDate.now().getMonth().compareTo(dob.getMonth()) > 0) {
            System.out.println("Don't subtract 1");
            return LocalDate.now().getYear() - dob.getYear();
        } else {
            System.out.println("Subtract 1");
            return LocalDate.now().getYear() - dob.getYear() - 1;
        }

    }

}
