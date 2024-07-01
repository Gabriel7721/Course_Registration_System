package com.iuh.kttkpm.be.registCourses.services;

import com.iuh.kttkpm.be.registCourses.client.LookUpPointClient;
import com.iuh.kttkpm.be.registCourses.models.Student;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final LookUpPointClient lookUpPointClient;
    public Student getStudentById(Long id){
        return lookUpPointClient.getStudentById(id);
    }

}
