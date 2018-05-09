package me.ye.labmsapi.controller;

import me.ye.constant.ApiResponseStatus;
import me.ye.dto.ApiResponse;
import me.ye.entity.Student;
import me.ye.labmsapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jacob
 * @date 08/05/2018
 */

@RestController
@RequestMapping("/students")
public class StudentController {


    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public ApiResponse getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ApiResponse(ApiResponseStatus.SUCCESS,
                "fetch all students successfully", students);
    }
}
