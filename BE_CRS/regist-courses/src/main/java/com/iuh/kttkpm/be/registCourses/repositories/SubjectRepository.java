package com.iuh.kttkpm.be.registCourses.repositories;

import com.iuh.kttkpm.be.registCourses.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}