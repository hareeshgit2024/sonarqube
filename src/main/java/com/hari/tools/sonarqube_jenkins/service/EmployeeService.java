package com.hari.tools.sonarqube_jenkins.service;

import com.hari.tools.sonarqube_jenkins.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    public String saveEmployees(Employee emp) {
        employeeList.add(emp);
        return "success";
    }
}
