package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
    private  EmployeeRepository repo;

   

    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repo.findById(id);
    }

    public List<Employee> getEmployeesByDepartment(Long deptId) {
        return repo.findByDepartmentId(deptId);
    }

    public Employee updateEmployee(Long id, Employee emp) {
        return repo.findById(id).map(existing -> {
            existing.setName(emp.getName());
            existing.setEmail(emp.getEmail());
            existing.setPhone(emp.getPhone());
            existing.setDepartment(emp.getDepartment());
            return repo.save(existing);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
