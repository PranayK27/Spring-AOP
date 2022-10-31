package com.pranay.springaop;

import com.pranay.springaop.model.Employee;
import com.pranay.springaop.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringAopApplication.class, args);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        employeeService.addEmployee(new Employee(100L, "pranay", "kekre", "pranay.2012k@gmail.com"));
        employeeService.getEmployeeById(100L);
        employeeService.getAllEmployees();
    }

}
