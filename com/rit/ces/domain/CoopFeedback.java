package com.rit.ces.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CoopFeedback {
    @NotNull
    private Long id;

    @NotBlank
    private String feedback;

    @NotNull
    private Long studentId;

    @NotNull
    private Long coopId;
}