package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.PerformanceReview;

public interface PerformanceReviewRepository extends JpaRepository<PerformanceReview, Long> {
    List<PerformanceReview> findByEmployeeId(Long employeeId);
}
