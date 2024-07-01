package com.iuh.kttkpm.be.lookUpPoints.repositories;

import com.iuh.kttkpm.be.lookUpPoints.models.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {
}