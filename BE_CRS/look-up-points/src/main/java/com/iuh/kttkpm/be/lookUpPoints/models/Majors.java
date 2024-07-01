package com.iuh.kttkpm.be.lookUpPoints.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
