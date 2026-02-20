package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Department;
import com.nit.repo.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
    private  DepartmentRepository repo;

    

    public Department saveDepartment(Department dept) {
        return repo.save(dept);
    }

    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    public Optional<Department> getDepartmentById(Long id) {
        return repo.findById(id);
    }

    public Department updateDepartment(Long id, Department dept) {
        return repo.findById(id).map(existing -> {
            existing.setName(dept.getName());
            return repo.save(existing);
        }).orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public void deleteDepartment(Long id) {
        repo.deleteById(id);
    }
}
