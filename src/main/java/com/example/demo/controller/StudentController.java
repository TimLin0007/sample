package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/stu/getAllStudent",method = RequestMethod.GET)
    public String getAllStudent(HttpServletRequest request){
        List<Student> list = studentService.getAllStudent();
        request.setAttribute("students",list);
        return "student";
    }

    @RequestMapping(value = "/stu/insert",method = RequestMethod.GET)
    public String insert(@ModelAttribute("student") Student student,Model model){
        studentService.insert(student);
        return "redirect:/stu/getAllStudent";
    }

    @RequestMapping(value = "/stu/update",method = RequestMethod.GET)
    public String update(Model model){
        List<Student> list = studentService.getAllStudent();
//        request.setAttribute("students",list);
        return "student.html";
    }

    @RequestMapping(value = "/stu/index",method = RequestMethod.GET)
    public String indexStu(Model model){
        model.addAttribute("student",new Student());
        return "insert";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }



}
