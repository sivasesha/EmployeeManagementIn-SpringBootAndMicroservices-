/**
 * 
 */
package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Employee;

/**
 * 
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentId(Long departmentId);

}
