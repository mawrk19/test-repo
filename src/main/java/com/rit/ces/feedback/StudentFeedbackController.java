package com.rit.ces.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/feedback")
public class StudentFeedbackController {

    @Autowired
    private StudentFeedbackService studentFeedbackService;

    @GetMapping
    public String getFeedbackForm(Model model) {
        model.addAttribute("feedbackForm", new StudentFeedbackForm());
        return "feedback";
    }

    @PostMapping
    public String submitFeedback(@Valid @ModelAttribute StudentFeedbackForm feedbackForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "feedback";
        }
        studentFeedbackService.submitFeedback(feedbackForm);
        redirectAttributes.addFlashAttribute("message", "Feedback submitted successfully");
        return "redirect:/feedback";
    }
}