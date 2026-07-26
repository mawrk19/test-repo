package com.rit.ces.evaluation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class EmployerEvaluationController {
    @Autowired
    private EmployerEvaluationService employerEvaluationService;

    @RequestMapping("/employer/evaluation")
    public String getEmployerEvaluationForm(Model model) {
        model.addAttribute("employerEvaluationForm", new EmployerEvaluationForm());
        return "employerEvaluation";
    }

    @PostMapping("/employer/evaluation")
    public String submitEmployerEvaluation(@Valid @ModelAttribute EmployerEvaluationForm employerEvaluationForm, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "employerEvaluation";
        }
        employerEvaluationService.submitEmployerEvaluation(employerEvaluationForm);
        redirectAttributes.addFlashAttribute("message", "Evaluation submitted successfully");
        return "redirect:/employer/evaluation";
    }
}