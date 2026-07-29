package com.rit.ces.service;

import com.rit.ces.model.Evaluation;
import com.rit.ces.model.EvaluationStatus;
import com.rit.ces.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;

    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }

    public Evaluation getEvaluationById(Long id) {
        return evaluationRepository.findById(id).orElse(null);
    }

    public void updateEvaluation(Evaluation evaluation) {
        evaluationRepository.save(evaluation);
    }
}