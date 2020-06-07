package com.atguigu.ssm.service;

import com.atguigu.ssm.beans.Employee;
import com.atguigu.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmps() {
        return employeeMapper.getAllEmps();

    }
}
