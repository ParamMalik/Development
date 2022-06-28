package com.app.reactive_with_redis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel implements Serializable {
    @Id
    private String id;
    private String name;
    private Double salary;
    private String company;
}
