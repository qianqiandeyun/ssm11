package com.jun.mapper;

import com.jun.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
    void save(Employee employee);
    void updateEmployee(Employee employee);
    Employee findForId(Integer id);
    void deleteForId(Integer id);
    List<Employee> finAll();
}
