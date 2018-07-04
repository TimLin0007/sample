package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/

public interface StudentService {

    List<Student> getAllStudent();

    boolean insert(Student student);

    boolean update(Integer id,Double score);

}
