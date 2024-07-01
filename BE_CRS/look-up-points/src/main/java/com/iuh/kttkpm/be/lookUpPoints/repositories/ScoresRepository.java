package com.iuh.kttkpm.be.lookUpPoints.repositories;

import com.iuh.kttkpm.be.lookUpPoints.models.Scores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoresRepository extends JpaRepository<Scores, Long> {
}