package me.ye.labmsapi.client;

import me.ye.dto.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jacob
 * @date 07/05/2018
 */

@FeignClient(name = "lab-ms-service", path = "/service/api/students")
public interface StudentClient {

    /**
     * Get all students
     *
     * @return ApiResponse contains a list of all students
     */
    @GetMapping
    ApiResponse getAllStudents();
}
