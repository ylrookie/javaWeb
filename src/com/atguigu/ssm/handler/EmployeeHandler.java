package com.atguigu.ssm.handler;

import com.atguigu.ssm.beans.Employee;
import com.atguigu.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 显示所有员工的信息
     */
    @RequestMapping(value = "/emps" ,method = RequestMethod.GET)
    public String listAllEmps(Map<String,Object> map){
        List<Employee> emps = employeeService.getAllEmps();
        map.put("emps",emps);
        return "list";
    }
}
