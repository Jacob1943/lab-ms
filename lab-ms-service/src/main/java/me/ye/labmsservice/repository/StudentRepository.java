package me.ye.labmsservice.repository;

import me.ye.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Jacob
 * @date 03/05/2018
 */
public interface StudentRepository extends MongoRepository<Student, String> {

}
