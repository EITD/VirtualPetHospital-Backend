package com.petHospital.learningSystem.controller;

import com.petHospital.learningSystem.model.CaseEntry;
import com.petHospital.learningSystem.model.CaseType;
import com.petHospital.learningSystem.service.CaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CaseController {
    private final CaseService caseService;

    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping("/case")
    public CaseEntry findCaseEntry(@RequestParam String name, @RequestParam int entry) {
        return caseService.findCaseEntry(name, entry);
    }

    @GetMapping("/caseType")
    public List<CaseType> findCaseType() {
        return caseService.findCaseType();
    }

}
