package com.nit.service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nit.entity.Attendance;
import com.nit.repo.AttendanceRepository;

@Service
public class AttendanceService {

    private final AttendanceRepository repo;

    public AttendanceService(AttendanceRepository repo) {
        this.repo = repo;
    }

    public Attendance saveAttendance(Attendance attendance) {
        return repo.save(attendance);
    }

    public List<Attendance> getAllAttendance() {
        return repo.findAll();
    }

    public Optional<Attendance> getAttendanceById(Long id) {
        return repo.findById(id);
    }

    public List<Attendance> getAttendanceByEmployee(Long empId) {
        return repo.findByEmployeeId(empId);
    }

    public List<Attendance> getAttendanceByDate(LocalDate date) {
        return repo.findByDate(date);
    }

    public Attendance updateAttendance(Long id, Attendance attendance) {
        return repo.findById(id).map(existing -> {
            existing.setEmployee(attendance.getEmployee());
            existing.setDate(attendance.getDate());
            existing.setStatus(attendance.getStatus());
            return repo.save(existing);
        }).orElseThrow(() -> new RuntimeException("Attendance not found"));
    }

    public void deleteAttendance(Long id) {
        repo.deleteById(id);
    }
}
