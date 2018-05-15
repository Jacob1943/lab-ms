package me.ye.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.ye.model.constant.SequenceCode;
import org.springframework.data.annotation.Id;

/**
 * @author Jacob
 * @date 2018/5/15
 */

@Data
@AllArgsConstructor
public class Sequence {

    @Id
    private SequenceCode id;
    private String initValue;
    private Integer increment;
    private Integer length;
    private String currentValue;
    private String nextValue;

}
