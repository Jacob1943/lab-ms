package me.ye.lab.ms.service.service.impl;


import me.ye.lab.ms.service.repository.StudentRepository;
import me.ye.lab.ms.service.service.StudentService;
import me.ye.model.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Jacob
 * @date 03/05/2018
 */
@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student newStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findById(String id) {
        Optional<Student> optional = studentRepository.findById(id);
        return optional.orElse(null);

    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
