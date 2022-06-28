package com.app.reactive_with_redis.dao.impl;

import com.app.reactive_with_redis.dao.EmployeeDAO;
import com.app.reactive_with_redis.model.EmployeeModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class EmployeeDAOImpl implements EmployeeDAO {
    private final String HASH_KEY = "Product";

    private final ReactiveRedisTemplate<String, EmployeeModel> redisTemplate;

//    private final ReactiveListOperations<Integer, EmployeeModel> reactiveListOps;

    public Mono<Boolean> saveEmployee(EmployeeModel employeeModel) {
        return redisTemplate.opsForHash().put(HASH_KEY, employeeModel.getId(), employeeModel);
    }
}

