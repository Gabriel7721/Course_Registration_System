package com.iuh.kttkpm.be.registCourses.dtos;

import com.iuh.kttkpm.be.registCourses.models.Subject;
import com.iuh.kttkpm.be.registCourses.models.SubjectType;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {
    private Long subjectId;
    private String name;
    private Long subjectTypeId;
    private int theoryCredit;
    private int practiceCredit;
    private List<Long> prerequisiteIds;


    public static SubjectDTO fromEntity(Subject subject) {
        SubjectDTO dto = new SubjectDTO();
        dto.setSubjectId(subject.getSubjectId());
        dto.setName(subject.getName());
        dto.setTheoryCredit(subject.getTheoryCredit());
        dto.setPracticeCredit(subject.getPracticeCredit());
        dto.setPrerequisiteIds(subject.getPrerequisites() != null ?
                subject.getPrerequisites().stream().map(Subject::getSubjectId).collect(Collectors.toList()) : null);
        return dto;
    }

    public static Subject toEntity(SubjectDTO dto, SubjectType subjectType, List<Subject> prerequisites) {
        Subject subject = new Subject();
        subject.setSubjectId(dto.getSubjectId());
        subject.setName(dto.getName());
        subject.setSubjectType(subjectType);
        subject.setTheoryCredit(dto.getTheoryCredit());
        subject.setPracticeCredit(dto.getPracticeCredit());
        subject.setPrerequisites(prerequisites);
        return subject;
    }
}
