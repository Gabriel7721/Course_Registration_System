package com.iuh.kttkpm.be.registCourses.dtos;

import com.iuh.kttkpm.be.registCourses.models.Majors;
import com.iuh.kttkpm.be.registCourses.models.Student;
import com.iuh.kttkpm.be.registCourses.models.StudentStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Long studentId;
    private String name;
    private String majorsName;
    private String facultyName;
    private String session;
    private StudentStatus status;
    private String email;
    private String phone;
    private String address;

    // Phương thức chuyển từ Student sang StudentDTO
    public static StudentDTO fromEntity(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setStudentId(student.getStudentId());
        dto.setName(student.getName());
        dto.setMajorsName(student.getMajors() != null ? student.getMajors().getName() : null);
        dto.setFacultyName(student.getMajors() != null && student.getMajors().getFaculty() != null ? student.getMajors().getFaculty().getName() : null);
        dto.setSession(student.getSession());
        dto.setStatus(student.getStatus());
        dto.setEmail(student.getEmail());
        dto.setPhone(student.getPhone());
        dto.setAddress(student.getAddress());
        return dto;
    }

    // Phương thức chuyển từ StudentDTO sang Student
    public static Student toEntity(StudentDTO dto, Majors majors) {
        Student student = new Student();
        student.setStudentId(dto.getStudentId());
        student.setName(dto.getName());
        student.setMajors(majors);
        student.setSession(dto.getSession());
        student.setStatus(dto.getStatus());
        student.setEmail(dto.getEmail());
        student.setPhone(dto.getPhone());
        student.setAddress(dto.getAddress());
        return student;
    }
}
