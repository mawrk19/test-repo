package com.rit.ces.repository;

import com.rit.ces.domain.CoopFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoopFeedbackRepository extends JpaRepository<CoopFeedback, Long> {
}