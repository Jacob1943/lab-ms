package me.ye.lab.ms.api.client;

import me.ye.model.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Jacob
 * @date 07/05/2018
 */

@FeignClient(name = "lab-ms-service", path = "/service/api/students")
public interface StudentClient {

    /**
     * Get all students
     *
     * @return a list of all students
     */
    @GetMapping
    List<Student> getAllStudents();

    @PostMapping
    Student addOne(Student student);
}
