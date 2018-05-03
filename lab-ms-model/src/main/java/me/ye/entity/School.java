package me.ye.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Jacob
 * @date 03/05/2018
 */

@Data
public class School {

    @Id
    private String id;
    private String name;
}
