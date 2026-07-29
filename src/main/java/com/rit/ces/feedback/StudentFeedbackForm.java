package com.rit.ces.feedback;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StudentFeedbackForm {
    @NotNull
    private String studentId;

    @NotNull
    private String coOpExperience;

    @Size(min = 10, max = 500)
    private String feedbackText;

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCoOpExperience() {
        return coOpExperience;
    }

    public void setCoOpExperience(String coOpExperience) {
        this.coOpExperience = coOpExperience;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }
}