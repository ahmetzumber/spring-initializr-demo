package com.example.demo;

import com.example.demo.student.Student;
import com.example.demo.student.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentDAO dao){
		return args -> {
			dao.save(new Student("Gedson",
								"gedson@gmail.com",
								LocalDate.of(2020, Month.FEBRUARY,9),
								22));
		};
	}
}
