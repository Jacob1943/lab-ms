package me.ye.labmsservice.service;

import me.ye.entity.Student;

import java.util.List;

/**
 * @author Jacob
 * @date 03/05/2018
 */

public interface StudentService {

    /**
     * add a new student
     *
     * @param student
     * @return Student
     */
    Student newStudent(Student student);

    /**
     * get Student by id
     *
     * @param id
     * @return Student
     */
    Student findById(String id);


    List<Student> findAll();
}
