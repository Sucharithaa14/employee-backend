package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeService {
    private final EmployeeRepository repo;
    public EmployeeService(EmployeeRepository repo) { this.repo=repo; }
    public List<Employee> getAllEmployees() { return repo.findAll(); }
    public Employee saveEmployee(Employee e) { return repo.save(e); }
    public void deleteEmployee(Long id) { repo.deleteById(id); }
}