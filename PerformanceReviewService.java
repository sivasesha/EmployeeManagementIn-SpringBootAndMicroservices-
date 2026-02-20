package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nit.entity.PerformanceReview;
import com.nit.repo.PerformanceReviewRepository;

@Service
public class PerformanceReviewService {

    private final PerformanceReviewRepository repo;

    public PerformanceReviewService(PerformanceReviewRepository repo) {
        this.repo = repo;
    }

    public PerformanceReview saveReview(PerformanceReview review) {
        return repo.save(review);
    }

    public List<PerformanceReview> getAllReviews() {
        return repo.findAll();
    }

    public Optional<PerformanceReview> getReviewById(Long id) {
        return repo.findById(id);
    }

    public List<PerformanceReview> getReviewsByEmployee(Long empId) {
        return repo.findByEmployeeId(empId);
    }

    public PerformanceReview updateReview(Long id, PerformanceReview review) {
        return repo.findById(id).map(existing -> {
            existing.setEmployee(review.getEmployee());
            existing.setReviewDate(review.getReviewDate());
            existing.setFeedback(review.getFeedback());
            existing.setRating(review.getRating());
            return repo.save(existing);
        }).orElseThrow(() -> new RuntimeException("Review not found"));
    }

    public void deleteReview(Long id) {
        repo.deleteById(id);
    }
}