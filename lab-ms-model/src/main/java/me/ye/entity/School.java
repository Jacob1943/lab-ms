package me.ye.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.ye.common.BaseEntity;
import org.springframework.data.annotation.Id;

/**
 * @author Jacob
 * @date 03/05/2018
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class School extends BaseEntity {

    @Id
    private String id;
    private String name;
}
