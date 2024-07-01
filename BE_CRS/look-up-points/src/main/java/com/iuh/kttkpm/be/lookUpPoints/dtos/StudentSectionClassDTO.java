package com.iuh.kttkpm.be.lookUpPoints.dtos;

import com.iuh.kttkpm.be.lookUpPoints.models.SectionClass;
import com.iuh.kttkpm.be.lookUpPoints.models.Student;
import com.iuh.kttkpm.be.lookUpPoints.models.StudentSectionClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentSectionClassDTO {
    private Long studentId;
    private Long sectionClassId;
    
    public static StudentSectionClassDTO fromEntity(Long studentId, Long sectionClassId) {
        StudentSectionClassDTO dto = new StudentSectionClassDTO();
        dto.setStudentId(studentId);
        dto.setSectionClassId(sectionClassId);
        return dto;
    }
    
    public static StudentSectionClass toEntity(Student student, SectionClass sectionClass) {
        StudentSectionClass studentSectionClass = new StudentSectionClass();
        studentSectionClass.setStudent(student);
        studentSectionClass.setSectionClass(sectionClass);
        return studentSectionClass;
    }
}
