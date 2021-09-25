package com.jun.service;

import com.jun.bean.Employee;
import com.jun.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.save(employee);
    }
}
