package me.ye.lab.ms.api.service.impl;

import me.ye.lab.ms.api.client.StudentClient;
import me.ye.lab.ms.api.service.StudentService;
import me.ye.model.entity.Student;
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
    public List<Student> getAllStudents() {
        return studentClient.getAllStudents();
    }

    @Override
    public Student addOne(Student student) {
        return studentClient.addOne(student);
    }
}
