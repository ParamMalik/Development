package com.app.reactive_with_redis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
    @Id
    private Integer id;
    private String name;
    private Double salary;
    private String company;
}
