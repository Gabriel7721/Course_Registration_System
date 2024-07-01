package com.iuh.kttkpm.be.lookUpPoints.controllers;

import com.iuh.kttkpm.be.lookUpPoints.models.Subject;
import com.iuh.kttkpm.be.lookUpPoints.repositories.SubjectRepository;
import com.iuh.kttkpm.be.lookUpPoints.services.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/look-up-points/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;
    private final SubjectRepository subjectRepository;

    @GetMapping
    public ResponseEntity<List<Subject>> findAllSubjects(){
        return ResponseEntity.ok(subjectRepository.findAll());
    }

    @GetMapping("/not-registered/{studentId}")
    public ResponseEntity<List<Subject>> findSubjectNotRegisteredByStudent(@PathVariable Long studentId){
        return ResponseEntity.ok(subjectService.findSubjectNotRegisteredByStudent(studentId));
    }

}
