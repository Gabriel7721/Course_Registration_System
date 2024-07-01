package com.iuh.kttkpm.be.registCourses.repositories;

import com.iuh.kttkpm.be.registCourses.models.Registion;
import com.iuh.kttkpm.be.registCourses.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistionRepository extends JpaRepository<Registion, Long> {
    List<Registion> findAllByStudent(Student student);
}