package com.pk_change.poc_mongo_pk_change.repository;

import com.pk_change.poc_mongo_pk_change.model.EmployeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeModel, String> {
}
