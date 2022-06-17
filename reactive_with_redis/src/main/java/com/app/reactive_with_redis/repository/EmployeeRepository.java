package com.app.reactive_with_redis.repository;

import com.app.reactive_with_redis.model.EmployeeModel;
import org.springframework.data.redis.core.ReactiveRedisOperations;

public interface EmployeeRepository extends ReactiveRedisOperations<EmployeeModel, Integer> {
}
