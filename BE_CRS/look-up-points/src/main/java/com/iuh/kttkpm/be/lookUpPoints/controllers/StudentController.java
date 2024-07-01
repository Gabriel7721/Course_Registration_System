package com.iuh.kttkpm.be.lookUpPoints.controllers;

import com.iuh.kttkpm.be.lookUpPoints.models.Student;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/look-up-points/students")
@RequiredArgsConstructor
public class StudentController {
//    private final StudentService studentService;
    private final StudentRepository studentRepository;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
                              studentRepository.save(student);
    }
    @GetMapping("/{studentId}")
    public ResponseEntity<Student> findStudentById(@PathVariable("studentId") Long studentId){
        return ResponseEntity.ok(studentRepository.findById(studentId).get());
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
        return ResponseEntity.ok(studentRepository.findAll());
    }

}
