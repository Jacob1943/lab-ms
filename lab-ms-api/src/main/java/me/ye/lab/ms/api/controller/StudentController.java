package me.ye.lab.ms.api.controller;

import me.ye.lab.ms.api.service.StudentService;
import me.ye.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addOne(@RequestBody Student student) {

        return new ResponseEntity<>(studentService.addOne(student), HttpStatus.CREATED);
    }
}
