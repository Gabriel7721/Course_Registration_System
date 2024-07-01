package com.iuh.kttkpm.be.lookUpPoints.controllers;

import com.iuh.kttkpm.be.lookUpPoints.models.Faculty;
import com.iuh.kttkpm.be.lookUpPoints.repositories.FacultyRepository;
import com.iuh.kttkpm.be.lookUpPoints.services.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/look-up-points/faculties")
@RequiredArgsConstructor
public class FacultyController {
    private final FacultyService facultyService;
    private final FacultyRepository facultyRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createFaculty( @RequestBody Faculty faculty){
        facultyService.saveFaculty(faculty);
    }

    @GetMapping
    public ResponseEntity<List<Faculty>> findAllFaculties() {
        return ResponseEntity.ok(facultyRepository.findAll());
    }
}
