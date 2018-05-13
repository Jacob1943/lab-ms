package me.ye.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Jacob
 * @date 2018/5/13
 */

@Data
@AllArgsConstructor
public class ErrorResponse {

    private Integer code;
    private String message;
    
}
