package com.hari.tools.sonarqube_jenkins.controller;

import com.hari.tools.sonarqube_jenkins.model.Employee;
import com.hari.tools.sonarqube_jenkins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/ping")
    public String ping() {
        return "Ping successful @ "+new Date();
    }

    @PostMapping
    public void saveData(@RequestBody Employee employee) {
        System.out.println("Employee save : " + employeeService.saveEmployees(employee));
    }
}
