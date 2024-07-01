package com.iuh.kttkpm.be.registCourses.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long studentId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "majors_id")
    private Majors majors;
    private String session;
    private StudentStatus status;
    private String email;
    private String phone;
    private String address;
}
