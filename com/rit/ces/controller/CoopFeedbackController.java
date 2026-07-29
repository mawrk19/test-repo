package com.rit.ces.controller;

import com.rit.ces.domain.CoopFeedback;
import com.rit.ces.service.CoopFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoopFeedbackController {

    private final CoopFeedbackService coopFeedbackService;

    @Autowired
    public CoopFeedbackController(CoopFeedbackService coopFeedbackService) {
        this.coopFeedbackService = coopFeedbackService;
    }

    @PostMapping("/coop-feedback")
    public ResponseEntity<CoopFeedback> submitFeedback(@RequestBody CoopFeedback feedback) {
        CoopFeedback submittedFeedback = coopFeedbackService.submitFeedback(feedback);
        return ResponseEntity.ok(submittedFeedback);
    }
}