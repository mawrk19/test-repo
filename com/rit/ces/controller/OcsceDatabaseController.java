package com.rit.ces.controller;

import com.rit.ces.service.OcsceDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OcsceDatabaseController {

    private final OcsceDatabaseService ocsceDatabaseService;

    @Autowired
    public OcsceDatabaseController(OcsceDatabaseService ocsceDatabaseService) {
        this.ocsceDatabaseService = ocsceDatabaseService;
    }

    @GetMapping("/authorization-data")
    public List<String> getAuthorizationDataForEmployers() {
        return ocsceDatabaseService.getAuthorizationDataForEmployers();
    }
}