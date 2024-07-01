package com.iuh.kttkpm.be.registCourses.controllers;

import com.iuh.kttkpm.be.registCourses.client.LookUpPointClient;
import com.iuh.kttkpm.be.registCourses.dtos.SubjectDTO;
import com.iuh.kttkpm.be.registCourses.models.Subject;
import com.iuh.kttkpm.be.registCourses.repositories.SubjectRepository;
import com.iuh.kttkpm.be.registCourses.services.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/regist-courses/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectRepository subjectRepository;
    private final SubjectService subjectService;
    private final LookUpPointClient lookUpPointClient;
    @GetMapping("/{studentId}")
    public ResponseEntity<List<SubjectDTO>> getAllSubjects(@PathVariable("studentId") Long studentId){
        List<Subject> subjects = lookUpPointClient.getSubjectNotRegisteredByStudent(studentId);
        List<Subject> subjectsNotRegistered = subjectService.findSubjectNotRegisteredByStudentAndListSubject(studentId, subjects);
        List<SubjectDTO> subjectDTOs = subjectsNotRegistered.stream().map(SubjectDTO::fromEntity).toList();
        return ResponseEntity.ok(subjectDTOs);
    }
}
