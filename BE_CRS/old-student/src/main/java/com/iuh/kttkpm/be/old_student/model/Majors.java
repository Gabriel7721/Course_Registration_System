package com.iuh.kttkpm.be.old_student.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Majors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long majorsId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

}
