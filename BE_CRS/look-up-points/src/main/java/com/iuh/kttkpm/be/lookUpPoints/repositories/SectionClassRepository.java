package com.iuh.kttkpm.be.lookUpPoints.repositories;

import com.iuh.kttkpm.be.lookUpPoints.models.SectionClass;
import com.iuh.kttkpm.be.lookUpPoints.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionClassRepository extends JpaRepository<SectionClass, Long> {
}