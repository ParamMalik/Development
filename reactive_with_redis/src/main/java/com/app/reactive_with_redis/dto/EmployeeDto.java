package com.app.reactive_with_redis.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Integer id;
    private String name;
    private Double salary;
    private String company;
}
