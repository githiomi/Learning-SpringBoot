package com.dhosiolux.springintro.models;

/*
 *
 * @created: 01-07-2023 --- 2:27 PM
 * @project: Learning Springboot
 * @author: Daniel Githiomi
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // Class variables
    public static int noOfUsers;

    // User objects fields
    private int userId;
    private String userName;
    private String email;
    private LocalDate dob;
    private int age;
    private String gender;

    // User objects constructors
    public User(String userName, String email, LocalDate dob, String gender) {
        this.userId = ++noOfUsers;
        this.userName = userName;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
    }
}
