package com.iuh.kttkpm.be.lookUpPoints.repositories;

import com.iuh.kttkpm.be.lookUpPoints.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}