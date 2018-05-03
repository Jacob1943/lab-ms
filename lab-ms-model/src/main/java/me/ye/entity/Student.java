package me.ye.entity;

import lombok.Data;
import me.ye.constant.Gender;
import org.springframework.data.annotation.Id;

/**
 * @author Jacob
 * @date 03/05/2018
 */

@Data
public class Student {

    @Id
    private String id;
    private String name;
    private Gender gender;
    private String school;
}
