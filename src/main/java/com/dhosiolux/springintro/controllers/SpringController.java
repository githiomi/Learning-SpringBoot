package com.dhosiolux.springintro.controllers;

/*
 *
 * @created: 01-07-2023 --- 1:34 PM
 * @project: Learning Springboot
 * @author: Daniel Githiomi
 *
 */

import com.dhosiolux.springintro.models.Gender;
import com.dhosiolux.springintro.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class SpringController {

    @GetMapping(path = "/users/1")
    protected User getUser(){
        return new User(
                "Daniel Githiomi",
                "daniel@githiomi.com",
                LocalDate.of(2001, 8, 27),
                Gender.MALE
        );
    }

    @GetMapping(path = "/users")
    protected ArrayList<User> getUsers(){
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

    @GetMapping(path = "/hello")
    protected String helloWorld(){
        return "Hello World!";
    }

}
