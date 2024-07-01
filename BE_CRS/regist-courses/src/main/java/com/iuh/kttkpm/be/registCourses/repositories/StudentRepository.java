package com.iuh.kttkpm.be.registCourses.repositories;

import com.iuh.kttkpm.be.registCourses.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}