package com.rit.ces.evaluation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployerEvaluationForm {
    @NotNull
    private Long employerId;

    @NotNull
    private Long studentId;

    @Size(min = 1, max = 1000)
    private String evaluationText;

    public Long getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Long employerId) {
        this.employerId = employerId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getEvaluationText() {
        return evaluationText;
    }

    public void setEvaluationText(String evaluationText) {
        this.evaluationText = evaluationText;
    }
}