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

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // User objects fields
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private int userId;
    private String userName;
    private String email;
    private LocalDate dob;
    private int age;
    private Gender gender;

    // User objects constructors
    public User(String userName, String email, LocalDate dob, Gender gender) {
        this.userName = userName;
        this.email = email;
        this.dob = dob;

        // compare months
        if (LocalDate.now().getMonth().compareTo(dob.getMonth()) > 0){
            this.age = LocalDate.now().getYear() - dob.getYear();
        }else {
            this.age = LocalDate.now().getYear() - dob.getYear() - 1;
        }

        this.gender = gender;
    }

}
