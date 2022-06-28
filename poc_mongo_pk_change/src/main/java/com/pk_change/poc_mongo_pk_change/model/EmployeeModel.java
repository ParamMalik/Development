package com.pk_change.poc_mongo_pk_change.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Employee_Details")
public class EmployeeModel {
    @Id
    private String firstName;
    private String lastName;
    private String address;
    private Double salary;
}
