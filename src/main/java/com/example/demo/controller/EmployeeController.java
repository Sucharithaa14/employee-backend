package com.example.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@RestController @RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service) { this.service=service; }
    @GetMapping public List<Employee> getAll() { return service.getAllEmployees(); }
    @PostMapping public Employee create(@RequestBody Employee e) { return service.saveEmployee(e); }
    @PutMapping("/{id}") public Employee update(@PathVariable Long id, @RequestBody Employee e) { e.setId(id); return service.saveEmployee(e); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.deleteEmployee(id); }
}