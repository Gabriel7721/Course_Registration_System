package com.iuh.kttkpm.be.tuition_fee.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long subjectId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "subject_type_id")
    private SubjectType subjectType;
    private int theoryCredit;
    private int practiceCredit;
    @ManyToMany
    @JoinTable(
            name = "subject_prerequisite",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "prerequisite_id")
    )
    private List<Subject> prerequisites;





}
