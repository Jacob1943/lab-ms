package me.ye.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.ye.common.BaseEntity;
import me.ye.constant.Gender;
import org.springframework.data.annotation.Id;

/**
 * @author Jacob
 * @date 03/05/2018
 */

@Data()
@EqualsAndHashCode(callSuper = true)
public class Student extends BaseEntity {

    @Id
    private String id;
    private String name;
    private Gender gender;
    private String school;
}
