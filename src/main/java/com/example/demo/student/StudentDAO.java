package com.example.demo.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student,Long> {

}
