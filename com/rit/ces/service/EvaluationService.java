package com.rit.ces.service;

import com.rit.ces.model.Evaluation;
import com.rit.ces.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluationService {
    @Autowired
    private EvaluationRepository evaluationRepository;

    public void submitEvaluation(Evaluation evaluation) {
        // Existing logic

        // Add EWA Student Development Guidelines and RIT Web Standards adherence
        evaluationRepository.save(evaluation);
    }
}