package com.iuh.kttkpm.be.registCourses.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SectionClass {
    @Id
    @Column(nullable = false)
    private Long sectionClassId;
    private String name;
    private String semester;
    private String year;
    private int studentNumber;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private String startDate;
    private String endDate;

    @Column
    private String theorySchedule;
    @Column
    private String practiceSchedule;
    private String room;

    public void setTheorySchedule(WeekDay day) {
        this.theorySchedule = day.getDisplayName();
    }

    public WeekDay getTheorySchedule() {
        return this.theorySchedule == null ? null : WeekDay.fromDisplayName(this.theorySchedule);
    }

    public void setPracticeSchedule(WeekDay day) {
        this.practiceSchedule = day.getDisplayName();
    }

    public WeekDay getPracticeSchedule() {
        return this.practiceSchedule == null ? null : WeekDay.fromDisplayName(this.practiceSchedule);
    }


}
