package com.example.demo.student;

import com.sun.tools.javac.util.List;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Ahmet",
                "ahmetzumber5@gmail.com",
                LocalDate.of(2020, Month.FEBRUARY,9),
                22
        ));
    }
}
