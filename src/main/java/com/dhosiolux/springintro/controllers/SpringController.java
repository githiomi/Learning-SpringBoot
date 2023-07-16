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
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class SpringController {

    // reference to user service
    private final UserService userService;

    @Autowired
    public SpringController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    protected List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping(path = "/users/new")
    @ResponseStatus(code = HttpStatus.CREATED)
    protected User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}