package com.nit.controller;

import java.util.List;

import com.nit.entity.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	  @PostMapping
	    public ResponseEntity<Department> createDepartment(@RequestBody Department dept) {
	        return ResponseEntity.ok(service.saveDepartment(dept));
	    }

	    @GetMapping
	    public ResponseEntity<List<Department>> getAllDepartments() {
	        return ResponseEntity.ok(service.getAllDepartments());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
	        return service.getDepartmentById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Department> updateDepartment(@PathVariable Long id, @RequestBody Department dept) {
	        return ResponseEntity.ok(service.updateDepartment(id, dept));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
	        service.deleteDepartment(id);
	        return ResponseEntity.noContent().build();
	    }
}
