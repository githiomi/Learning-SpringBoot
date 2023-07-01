package com.dhosiolux.springintro.controllers;

/*
 *
 * @created: 01-07-2023 --- 1:34 PM
 * @project: Learning Springboot
 * @author: Daniel Githiomi
 *
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping()
    protected String helloWorld(){
        return "Hello World!";
    }

}
