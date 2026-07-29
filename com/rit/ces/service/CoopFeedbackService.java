package com.rit.ces.service;

import com.rit.ces.domain.CoopFeedback;
import com.rit.ces.repository.CoopFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoopFeedbackService {

    private final CoopFeedbackRepository coopFeedbackRepository;

    @Autowired
    public CoopFeedbackService(CoopFeedbackRepository coopFeedbackRepository) {
        this.coopFeedbackRepository = coopFeedbackRepository;
    }

    public CoopFeedback submitFeedback(CoopFeedback feedback) {
        return coopFeedbackRepository.save(feedback);
    }
}