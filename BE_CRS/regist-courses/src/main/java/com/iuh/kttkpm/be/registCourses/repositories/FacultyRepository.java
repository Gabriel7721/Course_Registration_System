package com.iuh.kttkpm.be.registCourses.repositories;

import com.iuh.kttkpm.be.registCourses.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}