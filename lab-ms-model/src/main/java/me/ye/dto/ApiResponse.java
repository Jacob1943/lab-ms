package me.ye.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;
import me.ye.constant.ApiResponseStatus;

/**
 * @author Jacob
 * @date 04/05/2018
 */


@Data
@JsonInclude(Include.NON_NULL)
public class ApiResponse {

    private ApiResponseStatus status;
    private String message;
    private Object data;

}
