package com.workshop.demo;

import com.workshop.demo.models.Student;
import com.workshop.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student maria = new Student(
					"Maria",
					"Joans",
					"maria.jones@example.com",
					21
			);
			studentRepository.save(maria);

			Scanner in = new Scanner(System.in);

			String s = in.nextLine();
			System.out.println("You entered string " + s);
		};
	}
}
