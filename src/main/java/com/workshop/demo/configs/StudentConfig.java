package com.workshop.demo.configs;

import com.workshop.demo.models.Student;
import com.workshop.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student mariam = new Student(
                    "Mariam",
                    "mariam@example.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@example.com",
                    LocalDate.of(2004, JANUARY, 18)
            );

            repository.saveAll(List.of(mariam, alex));

        };
    }
}
