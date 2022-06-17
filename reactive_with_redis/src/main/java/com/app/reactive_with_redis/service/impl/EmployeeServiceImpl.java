package com.app.reactive_with_redis.service.impl;

import com.app.reactive_with_redis.dao.EmployeeDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl {
    private final EmployeeDAO employeeDAO;
}
