package com.iuh.kttkpm.be.lookUpPoints.controllers;

import com.iuh.kttkpm.be.lookUpPoints.dtos.StudentSectionClassDTO;
import com.iuh.kttkpm.be.lookUpPoints.models.SectionClass;
import com.iuh.kttkpm.be.lookUpPoints.models.Student;
import com.iuh.kttkpm.be.lookUpPoints.models.StudentSectionClass;
import com.iuh.kttkpm.be.lookUpPoints.repositories.SectionClassRepository;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentRepository;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentSectionClassRepository;
import com.iuh.kttkpm.be.lookUpPoints.services.StudentSectionClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/look-up-points/student-section-classes")
@RequiredArgsConstructor
public class StudentSectionClassController {
    private final StudentSectionClassService studentSectionClassService;
    private final StudentSectionClassRepository studentSectionClassRepository;
    private final StudentRepository studentRepository;
    private final SectionClassRepository sectionClassRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudentSectionClass(@RequestBody StudentSectionClassDTO studentSectionClassDTO){
        Student student = studentRepository.findById(studentSectionClassDTO.getStudentId()).get();
        SectionClass sectionClass = sectionClassRepository.findById(studentSectionClassDTO.getSectionClassId()).get();
        StudentSectionClass studentSectionClass = StudentSectionClassDTO.toEntity(student, sectionClass);
        studentSectionClassRepository.save(studentSectionClass);
    }
    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<SectionClass>> getAllSectionClassByStudentId(@PathVariable Long studentId){
        return ResponseEntity.ok(studentSectionClassService.getAllSectionClassByStudentId(studentId));
    }
}
