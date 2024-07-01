package com.iuh.kttkpm.be.lookUpPoints.services;

import com.iuh.kttkpm.be.lookUpPoints.models.Faculty;
import com.iuh.kttkpm.be.lookUpPoints.repositories.FacultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FacultyService {
    private final FacultyRepository facultyRepository;
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }
    public Faculty getFacultyById(Long id) {
        return facultyRepository.findById(id).orElse(null);
    }
    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }
    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
    public Faculty updateFaculty(Long id, Faculty faculty) {
        Faculty existingFaculty = facultyRepository.findById(id).orElse(null);
        if (existingFaculty == null) {
            return null;
        }
        existingFaculty.setName(faculty.getName());
        return facultyRepository.save(existingFaculty);
    }

}
