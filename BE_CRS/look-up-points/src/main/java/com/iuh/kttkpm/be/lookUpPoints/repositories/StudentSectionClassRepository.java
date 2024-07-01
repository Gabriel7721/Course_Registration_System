package com.iuh.kttkpm.be.lookUpPoints.repositories;

import com.iuh.kttkpm.be.lookUpPoints.models.Student;
import com.iuh.kttkpm.be.lookUpPoints.models.StudentSectionClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentSectionClassRepository extends JpaRepository<StudentSectionClass, Long> {
    List<StudentSectionClass> findByStudent(Student student);
}