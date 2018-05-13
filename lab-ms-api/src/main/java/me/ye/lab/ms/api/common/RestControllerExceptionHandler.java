package me.ye.lab.ms.api.common;

import feign.FeignException;
import me.ye.model.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Jacob
 * @date 2018/5/13
 */

@RestControllerAdvice
public class RestControllerExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<ErrorResponse> feignExceptionHandler(FeignException fe) {

        return new ResponseEntity<>(
                new ErrorResponse(fe.status(), fe.getMessage()),
                HttpStatus.valueOf(fe.status()));

    }
}
