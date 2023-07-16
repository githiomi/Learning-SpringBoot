package com.dhosiolux.springintro.models;

/*
 *
 * @created: 01-07-2023 --- 2:47 PM
 * @project: Learning Springboot
 * @author: Daniel Githiomi
 *
 */

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");

    public final String gender;

    Gender(String gender){
        this.gender = gender;
    }
}
