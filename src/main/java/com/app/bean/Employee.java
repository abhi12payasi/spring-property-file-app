package com.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("app.properties")
public class Employee {
    @Value("${empName}")
    private String name;
    @Value("${empAge}")
    private Integer age;
    @Value("${empSalary}")
    private Double salary;
    @Value("${empTasks}")
    private List<String> taskList;
    @Autowired //@Value("#{department}")
    private Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", taskList=" + taskList +
                ", department=" + department +
                '}';
    }
}
