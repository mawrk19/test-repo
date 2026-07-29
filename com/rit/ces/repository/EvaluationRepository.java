package com.rit.ces.repository;

import com.rit.ces.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
    // Existing methods

    // Add EWA Student Development Guidelines and RIT Web Standards adherence
    Evaluation findByStudentIdAndEmployerId(Long studentId, Long employerId);
}