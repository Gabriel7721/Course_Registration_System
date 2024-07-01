package com.iuh.kttkpm.be.registCourses.services;

import com.iuh.kttkpm.be.registCourses.models.Registion;
import com.iuh.kttkpm.be.registCourses.models.Subject;
import com.iuh.kttkpm.be.registCourses.repositories.RegistionRepository;
import com.iuh.kttkpm.be.registCourses.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistionService {
    private final RegistionRepository registionRepository;
    private final StudentRepository studentRepository;
    public List<Registion> getAllRegistionByStudentId(Long studentId){
        return registionRepository.findAllByStudent(studentRepository.findById(studentId).get());
    }


}
