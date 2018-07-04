package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Mapper
public interface StudentDAO {

    @Select(value = "SELECT * FROM student")
    List<Student> getAllStudent();

    @Insert(value = "INSERT INTO student(student.`name`,student.`no`,student.score)\n" +
            "VALUE(#{name},#{no},#{score})")
    int insert(Student student);

    @Update(value = "UPDATE student SET student.score = #{score} WHERE student.id = #{id}")
    int update(Integer id,Double score);

}
