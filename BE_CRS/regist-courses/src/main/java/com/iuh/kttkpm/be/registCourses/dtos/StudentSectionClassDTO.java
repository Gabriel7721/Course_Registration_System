package com.iuh.kttkpm.be.registCourses.dtos;

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
    
    public static StudentSectionClassDTO toEntity(StudentSectionClassDTO dto) {
        return new StudentSectionClassDTO(dto.getStudentId(), dto.getSectionClassId());
    }
}
