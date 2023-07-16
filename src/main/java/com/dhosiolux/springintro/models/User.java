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
    private int age;
    private Gender gender;

    // User objects constructors
    public User(String userName, String email, LocalDate dob, Gender gender) {
        this.userName = userName;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.getCurrentAge(dob);
    }

    // Method to calculate the age of the user
    public void getCurrentAge(LocalDate dob){

        // compare months
        if (LocalDate.now().getMonth().compareTo(dob.getMonth()) > 0) {
            System.out.println("Don't subtract 1");
            this.setAge(LocalDate.now().getYear() - dob.getYear());
        } else {
            System.out.println("Subtract 1");
            this.setAge(LocalDate.now().getYear() - dob.getYear() - 1);
        }

    }

}