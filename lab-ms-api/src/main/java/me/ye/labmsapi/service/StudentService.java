package me.ye.labmsapi.service;


import me.ye.entity.Student;

import java.util.List;

/**
 * @author Jacob
 * @date 07/05/2018
 */

public interface StudentService {

    /**
     * getting all students
     *
     * @return list of all students
     */
    List<Student> getAllStudents();
}
