package com.rit.ces.controller;

import com.rit.ces.model.Evaluation;
import com.rit.ces.model.EvaluationStatus;
import com.rit.ces.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final EvaluationService evaluationService;

    @Autowired
    public AdminController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping("/evaluations")
    public String getEvaluations(Model model) {
        List<Evaluation> evaluations = evaluationService.getAllEvaluations();
        model.addAttribute("evaluations", evaluations);
        return "admin/evaluations";
    }

    @PostMapping("/evaluations/{id}/status")
    public String updateEvaluationStatus(@PathVariable Long id, @ModelAttribute EvaluationStatus status) {
        Evaluation evaluation = evaluationService.getEvaluationById(id);
        if (evaluation != null) {
            evaluation.setStatus(status);
            evaluationService.updateEvaluation(evaluation);
        }
        return "redirect:/admin/evaluations";
    }
}