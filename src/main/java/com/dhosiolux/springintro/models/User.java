package com.dhosiolux.springintro.models;

/*
 *
 * @created: 01-07-2023 --- 2:27 PM
 * @project: Learning Springboot
 * @author: Daniel Githiomi
 *
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Table
@Entity(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // User objects fields
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    @Column(name = "user_id")
    private UUID userId;
    @Column(name = "username")
    private String userName;
    private String email;
    @Column(name = "date_of_birth")
    private LocalDate dob;
    @Transient
    private int age;
    private Gender gender;

    // User objects constructors
    public User(String userName, String email, LocalDate dob, Gender gender) {
        this.userName = userName;
        this.email = email;
        this.dob = dob;
        this.age = getCurrentAge();
        this.gender = gender;
    }

    // Method to calculate the age of the user
    protected int getCurrentAge(){

        // compare months
        if (LocalDate.now().getMonth().compareTo(dob.getMonth()) > 0) {
            return this.age = LocalDate.now().getYear() - dob.getYear();
        } else {
            return this.age = LocalDate.now().getYear() - dob.getYear() - 1;
        }

    }

}