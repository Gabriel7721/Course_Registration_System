package com.iuh.kttkpm.be.registCourses.services;

import com.iuh.kttkpm.be.registCourses.client.LookUpPointClient;
import com.iuh.kttkpm.be.registCourses.dtos.StudentSectionClassDTO;
import com.iuh.kttkpm.be.registCourses.models.SectionClass;
import com.iuh.kttkpm.be.registCourses.repositories.SectionClassRepository;
import com.iuh.kttkpm.be.registCourses.repositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class SectionClassService {
    private final SectionClassRepository sectionClassRepository;
    private final SubjectRepository subjectRepository;
    private final LookUpPointClient lookUpPointClient ;
    public List<SectionClass> getAllSectionClassBySubjectId(Long subjectId){
        return sectionClassRepository.findAllBySubject(subjectRepository.findById(subjectId).get());
    }

    @Async
    public CompletableFuture<Void> createSectionClass(SectionClass sectionClass) {
        lookUpPointClient.createSectionClass(sectionClass);
        return CompletableFuture.completedFuture(null);
    }

    @Async
    public CompletableFuture<Void> createStudentSectionClass(StudentSectionClassDTO dto) {
        lookUpPointClient.createStudentSectionClass(dto);
        return CompletableFuture.completedFuture(null);
    }
}
