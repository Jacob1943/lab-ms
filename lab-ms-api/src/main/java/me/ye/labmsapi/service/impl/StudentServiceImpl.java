package me.ye.labmsapi.service.impl;

import me.ye.entity.Student;
import me.ye.labmsapi.client.StudentClient;
import me.ye.labmsapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jacob
 * @date 07/05/2018
 */

@Service
public class StudentServiceImpl implements StudentService {

    private StudentClient studentClient;

    @Autowired
    public StudentServiceImpl(StudentClient studentClient) {
        this.studentClient = studentClient;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Student> getAllStudents() {
        return (List<Student>)studentClient.getAllStudents().getData();
    }
}
