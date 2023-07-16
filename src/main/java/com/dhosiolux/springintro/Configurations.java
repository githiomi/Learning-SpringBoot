package com.dhosiolux.springintro;

import com.dhosiolux.springintro.models.Gender;
import com.dhosiolux.springintro.models.User;
import com.dhosiolux.springintro.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class Configurations {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){

        return args -> {

            // Create new users to add to the database
            User daniel = new User("Daniel Githiomi", "danielgithiomi@gmail.com", LocalDate.of(2001, 8, 27), Gender.MALE);
            User francis = new User("Francis Kikulwe", "franciskikulwe@gmail.com", LocalDate.of(1998, 2, 10), Gender.MALE);
            User cathy = new User("Cathy Owino", "cathyowino@gmail.com", LocalDate.of(2000, 11, 22), Gender.FEMALE);

            // Add users to the repository
            userRepository.saveAll(
                    List.of(daniel, francis, cathy)
            );

        };

    }

}
