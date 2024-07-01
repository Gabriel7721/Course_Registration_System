package com.iuh.kttkpm.be.lookUpPoints.services;

import com.iuh.kttkpm.be.lookUpPoints.models.StudentSectionClass;
import com.iuh.kttkpm.be.lookUpPoints.models.Subject;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentRepository;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentSectionClassRepository;
import com.iuh.kttkpm.be.lookUpPoints.repositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubjectService {
    private final SubjectRepository subjectRepository;
    private final StudentRepository studentRepository;
    private final StudentSectionClassRepository studentClassRepository;
    public List<Subject> findSubjectNotRegisteredByStudent(Long studentId){
        List<StudentSectionClass> studentSectionClasses = studentClassRepository.findByStudent(studentRepository.findById(studentId).get());
        Set<Subject> registeredSubject = studentSectionClasses.stream()
                .map(studentSectionClass -> studentSectionClass.getSectionClass().getSubject())
                .collect(Collectors.toSet());
        List<Subject> allSubject = subjectRepository.findAll();
        allSubject.removeAll(registeredSubject);
        return allSubject;
    }
}
