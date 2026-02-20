package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
