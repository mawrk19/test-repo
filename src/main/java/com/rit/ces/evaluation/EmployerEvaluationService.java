package com.rit.ces.evaluation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployerEvaluationService {
    @Autowired
    private EmployerEvaluationRepository employerEvaluationRepository;

    @Transactional
    public void submitEmployerEvaluation(EmployerEvaluationForm employerEvaluationForm) {
        EmployerEvaluation employerEvaluation = new EmployerEvaluation();
        employerEvaluation.setEmployerId(employerEvaluationForm.getEmployerId());
        employerEvaluation.setStudentId(employerEvaluationForm.getStudentId());
        employerEvaluation.setEvaluationText(employerEvaluationForm.getEvaluationText());
        employerEvaluationRepository.save(employerEvaluation);
    }
}