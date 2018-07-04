package com.example.demo.service.impl;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent();
    }

    @Override
    public boolean insert(Student student) {
        if (null == student){
            return false;
        }
        // do something...
        studentDAO.insert(student);
        return true;
    }

    @Override
    public boolean update(Integer id, Double score) {
        if ( null == id || null  == score){
            return false;
        }
        // do something...
        studentDAO.update(id,score);
        return true;
    }
}
