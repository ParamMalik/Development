package com.app.reactive_with_redis.dao;


import com.app.reactive_with_redis.model.EmployeeModel;
import reactor.core.publisher.Mono;

public interface EmployeeDAO {
     Mono<Boolean> saveEmployee(EmployeeModel employeeModel);
}
