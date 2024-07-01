package com.iuh.kttkpm.be.lookUpPoints.controllers;

import com.iuh.kttkpm.be.lookUpPoints.models.SectionClass;
import com.iuh.kttkpm.be.lookUpPoints.repositories.SectionClassRepository;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/look-up-points/section-classes")
@RequiredArgsConstructor
public class SectionClassController {
    private final SectionClassRepository sectionClassRepository;
    private final StudentRepository studentRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSectionClass(@RequestBody SectionClass sectionClass) {
        sectionClassRepository.save(sectionClass);
    }

}
