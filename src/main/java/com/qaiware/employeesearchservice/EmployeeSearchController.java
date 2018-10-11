package com.qaiware.employeesearchservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EmployeeSearchController {

    @Value("${employee}")
    private String employee;

    @GetMapping
    public String getEmployee() {
        return employee;
    }
}
