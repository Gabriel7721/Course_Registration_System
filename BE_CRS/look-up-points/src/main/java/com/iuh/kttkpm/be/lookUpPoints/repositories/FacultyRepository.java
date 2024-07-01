package com.iuh.kttkpm.be.lookUpPoints.repositories;

import com.iuh.kttkpm.be.lookUpPoints.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

}