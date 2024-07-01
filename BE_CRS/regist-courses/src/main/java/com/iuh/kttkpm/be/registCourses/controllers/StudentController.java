package com.iuh.kttkpm.be.registCourses.controllers;

import com.iuh.kttkpm.be.registCourses.client.LookUpPointClient;
import com.iuh.kttkpm.be.registCourses.models.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/regist-courses/students")
@RequiredArgsConstructor
public class StudentController {
    private final LookUpPointClient lookUpPointClient;

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Long studentId){
        return ResponseEntity.ok(lookUpPointClient.getStudentById(studentId));
    }
}
