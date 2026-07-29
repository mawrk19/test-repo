package com.rit.ces.controller;

import com.rit.ces.model.Evaluation;
import com.rit.ces.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/evaluations")
public class EvaluationController {
    @Autowired
    private EvaluationService evaluationService;

    @GetMapping
    public String getEvaluations(Model model) {
        // Existing logic

        // Add EWA Student Development Guidelines and RIT Web Standards adherence
        model.addAttribute("evaluation", new Evaluation());
        return "evaluations";
    }

    @PostMapping
    public String submitEvaluation(@ModelAttribute Evaluation evaluation) {
        // Existing logic

        // Add EWA Student Development Guidelines and RIT Web Standards adherence
        evaluationService.submitEvaluation(evaluation);
        return "redirect:/evaluations";
    }
}