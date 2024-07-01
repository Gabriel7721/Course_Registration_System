package com.iuh.kttkpm.be.registCourses.dtos;

import com.iuh.kttkpm.be.registCourses.models.SectionClass;
import com.iuh.kttkpm.be.registCourses.models.Subject;
import com.iuh.kttkpm.be.registCourses.models.WeekDay;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SectionClassDTO {
    private Long sectionClassId;
    private String name;
    private String semester;
    private String year;
    private int studentNumber;
    private Long subjectId;
    private String startDate;
    private String endDate;
    private String theorySchedule;
    private String practiceSchedule;
    private String room;

    public static SectionClassDTO fromEntity(SectionClass sectionClass) {
        SectionClassDTO dto = new SectionClassDTO();
        dto.setSectionClassId(sectionClass.getSectionClassId());
        dto.setName(sectionClass.getName());
        dto.setSemester(sectionClass.getSemester());
        dto.setYear(sectionClass.getYear());
        dto.setStudentNumber(sectionClass.getStudentNumber());
        dto.setSubjectId(sectionClass.getSubject().getSubjectId());
        dto.setStartDate(sectionClass.getStartDate());
        dto.setEndDate(sectionClass.getEndDate());
        dto.setTheorySchedule(sectionClass.getTheorySchedule() != null ? sectionClass.getTheorySchedule().getDisplayName() : null);
        dto.setPracticeSchedule(sectionClass.getPracticeSchedule() != null ? sectionClass.getPracticeSchedule().getDisplayName() : null);
        dto.setRoom(sectionClass.getRoom());
        return dto;
    }

    public static SectionClass toEntity(SectionClassDTO dto, Subject subject) {
        SectionClass sectionClass = new SectionClass();
        sectionClass.setSectionClassId(dto.getSectionClassId());
        sectionClass.setName(dto.getName());
        sectionClass.setSemester(dto.getSemester());
        sectionClass.setYear(dto.getYear());
        sectionClass.setStudentNumber(dto.getStudentNumber());
        sectionClass.setSubject(subject);
        sectionClass.setStartDate(dto.getStartDate());
        sectionClass.setEndDate(dto.getEndDate());
        sectionClass.setTheorySchedule(dto.getTheorySchedule() != null ? WeekDay.fromDisplayName(dto.getTheorySchedule()) : null);
        sectionClass.setPracticeSchedule(dto.getPracticeSchedule() != null ? WeekDay.fromDisplayName(dto.getPracticeSchedule()) : null);
        sectionClass.setRoom(dto.getRoom());
        return sectionClass;
    }
}
