package com.iuh.kttkpm.be.registCourses.controllers;

import com.iuh.kttkpm.be.registCourses.dtos.SectionClassDTO;
import com.iuh.kttkpm.be.registCourses.models.SectionClass;
import com.iuh.kttkpm.be.registCourses.repositories.SectionClassRepository;
import com.iuh.kttkpm.be.registCourses.repositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/regist-courses/section-classes")
@RequiredArgsConstructor
public class SectionClassController {
    private final SectionClassRepository sectionClassRepository;
    private final SubjectRepository subjectRepository;

    @GetMapping("/get-all-by-subject-id/{subjectId}")
    public ResponseEntity<List<SectionClassDTO>> getAllSectionClassBySubject(@PathVariable String subjectId){
        List<SectionClass> sectionClasses = sectionClassRepository.findAllBySubject(subjectRepository.findById(Long.valueOf(subjectId)).get());
        List<SectionClassDTO> sectionClassDTOs = sectionClasses.stream().map(SectionClassDTO::fromEntity).toList();
        return ResponseEntity.ok(sectionClassDTOs);
    }
    @GetMapping
    public ResponseEntity<List<SectionClassDTO>> getAllSectionClasses() {
        List<SectionClass> sectionClasses = sectionClassRepository.findAll();
        List<SectionClassDTO> sectionClassDTOs = sectionClasses.stream().map(SectionClassDTO::fromEntity).toList();
        return ResponseEntity.ok(sectionClassDTOs);
    }

}
