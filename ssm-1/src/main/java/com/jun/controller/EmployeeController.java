package com.jun.controller;

import com.jun.bean.Employee;
import com.jun.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/addEmployee")
    public String addEmployee(){
        Employee employee=new Employee();
        employee.setId(15);
        employee.setGender(0);
        employee.setUsername("lili");
        employee.setPassword("154dsda5");
           employeeService.addEmployee(employee);
        return "success";
    }

    public static void main(String[] args) {
        System.out.println("版本一");
        System.out.println("版本三");
    }
}
