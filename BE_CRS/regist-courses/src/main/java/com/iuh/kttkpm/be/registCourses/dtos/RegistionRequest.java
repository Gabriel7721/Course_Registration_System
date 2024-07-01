package com.iuh.kttkpm.be.registCourses.dtos;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class RegistionRequest {
    @NotEmpty(message = "Student ID cannot be empty")
    private String studentId;

    @NotEmpty(message = "Section Class ID cannot be empty")
    private String sectionClassId;
}
