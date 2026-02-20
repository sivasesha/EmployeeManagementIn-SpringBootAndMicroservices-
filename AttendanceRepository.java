package com.nit.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	  List<Attendance> findByEmployeeId(Long employeeId);
	    List<Attendance> findByDate(LocalDate date);
}
