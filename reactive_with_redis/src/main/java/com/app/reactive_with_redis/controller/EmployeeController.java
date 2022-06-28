package com.app.reactive_with_redis.controller;

import com.app.reactive_with_redis.dao.EmployeeDAO;
import com.app.reactive_with_redis.model.EmployeeModel;
import com.app.reactive_with_redis.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.ReactiveListOperations;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
import org.springframework.data.redis.core.ReactiveValueOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeDAO employeeDAO;

//    private ReactiveValueOperations<String, EmployeeModel> reactiveValueOps;

//    public ReactiveValueOperations<String, EmployeeModel> getReactiveListOps(ReactiveRedisTemplate reactiveStringRedisTemplate) {
//        return this.reactiveValueOps = reactiveStringRedisTemplate.opsForValue();
//    }


    @PostMapping
    public Mono<Boolean> addEmployee(@RequestBody EmployeeModel employeeModel) {
        return employeeDAO.saveEmployee(employeeModel);
    }

}
