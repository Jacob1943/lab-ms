package me.ye.labmsservice.controller;

import me.ye.constant.ApiResponseStatus;
import me.ye.dto.ApiResponse;
import me.ye.entity.Student;
import me.ye.labmsservice.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jacob
 * @date 03/05/2018
 */

@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;


    @PostMapping
    public ApiResponse newStudent(@RequestBody Student student) {
        LOGGER.debug("Start adding new student");
        if (student.getId() != null) {
            LOGGER.error("student unsaved should not have id");
            return new ApiResponse(ApiResponseStatus.ERROR,
                    "student unsaved should not have id", null);
        }
        Student savedStudent = studentService.newStudent(student);
        return new ApiResponse(ApiResponseStatus.SUCCESS,
                "new student saved successfully", savedStudent);
    }

    @GetMapping
    public ApiResponse findAll() {
        List<Student> students = studentService.findAll();
        return new ApiResponse(ApiResponseStatus.SUCCESS,
                "fetch all students successfully", students);
    }
}
