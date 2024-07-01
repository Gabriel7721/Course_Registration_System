package com.iuh.kttkpm.be.old_student.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Scores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long scoresId;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private Float midTerm;
    private List<Float> regular;
    private List<Float> practice;
    private Float finalTerm;

}
