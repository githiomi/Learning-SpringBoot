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
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


@Service
public class UserService {

    // Method to get a single user
    public User getUser() {
        return new User(
                "Daniel Githiomi",
                "daniel@githiomi.com",
                LocalDate.of(2001, 8, 27),
                Gender.MALE
        );
    }

    // Method to get all the users
    public ArrayList<User> getUsers() {
        return new ArrayList<User>(
                Arrays.asList(
                        new User(
                                "Daniel Githiomi",
                                "daniel@githiomi.com",
                                LocalDate.of(2001, 8, 27),
                                Gender.MALE
                        ),
                        new User(
                                "Faith Wamaitha",
                                "faith@wamaitha.com",
                                LocalDate.of(1998, 7, 17),
                                Gender.FEMALE
                        )
                ));
    }
}
