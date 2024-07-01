package com.iuh.kttkpm.be.registCourses.client;

import com.iuh.kttkpm.be.registCourses.dtos.StudentSectionClassDTO;
import com.iuh.kttkpm.be.registCourses.models.SectionClass;
import com.iuh.kttkpm.be.registCourses.models.Student;
import com.iuh.kttkpm.be.registCourses.models.Subject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.look-up-points-url}")
public interface LookUpPointClient {
    @GetMapping("/students/{studentId}")
    Student getStudentById(@PathVariable("studentId") Long studentId);
    @GetMapping("subjects")
    List<Subject> getAllSubjects();
    @GetMapping("/subjects/not-registered/{studentId}")
    List<Subject> getSubjectNotRegisteredByStudent(@PathVariable("studentId") Long studentId);
    @PostMapping("/student-section-classes")
    void createStudentSectionClass(@Valid @RequestBody StudentSectionClassDTO studentSectionClassDTO);
    @PostMapping("/section-classes")
    void createSectionClass(@Valid @RequestBody SectionClass sectionClass);
}
