package me.ye.labmsservice.controller;

import me.ye.entity.Student;
import me.ye.labmsservice.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> newStudent(@RequestBody Student student) {
        LOGGER.debug("Start adding new student");
        if (student.getId() != null) {
            LOGGER.error("student unsaved should not have id");
            return new ResponseEntity<>(
                    "student unsaved should not have id", HttpStatus.BAD_REQUEST);
        }
        Student savedStudent = studentService.newStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        List<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
