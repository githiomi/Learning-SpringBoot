package com.dhosiolux.springintro.controllers;

/*
 *
 * @created: 01-07-2023 --- 1:34 PM
 * @project: Learning Springboot
 * @author: Daniel Githiomi
 *
 */

import com.dhosiolux.springintro.models.User;
import com.dhosiolux.springintro.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "api/v1")
public class SpringController {

    // reference to user service
    private final UserService userService;

    @Autowired
    public SpringController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users/1")
    protected User getUser() {
        return userService.getUser();
    }

    @GetMapping(path = "/users")
    protected ArrayList<User> getUsers() {
        return userService.getUsers();
    }

}
