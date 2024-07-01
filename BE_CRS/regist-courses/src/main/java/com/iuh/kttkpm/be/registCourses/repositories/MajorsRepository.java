package com.iuh.kttkpm.be.registCourses.repositories;

import com.iuh.kttkpm.be.registCourses.models.Majors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MajorsRepository extends JpaRepository<Majors, Long> {
}