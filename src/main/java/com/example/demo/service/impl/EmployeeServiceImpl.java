package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.getById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee exitingEmployee= employeeRepository.getById(id);
        exitingEmployee.setName(employee.getName());
        exitingEmployee.setEmail(employee.getEmail());
        exitingEmployee.setAge(employee.getAge());
        employeeRepository.save(exitingEmployee);
        return exitingEmployee;
    }
}
