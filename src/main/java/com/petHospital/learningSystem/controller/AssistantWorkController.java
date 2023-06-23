package com.petHospital.learningSystem.controller;

import com.petHospital.learningSystem.model.AssistantWork;
import com.petHospital.learningSystem.model.AssistantWorkType;
import com.petHospital.learningSystem.service.AssistantWorkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssistantWorkController {
    private final AssistantWorkService assistantWorkService;

    public AssistantWorkController(AssistantWorkService assistantWorkService) {
        this.assistantWorkService = assistantWorkService;
    }

    @GetMapping("/assistantWork")
    public AssistantWork findAssistantWork(@RequestParam String name) {
        return assistantWorkService.findAssistantWork(name);
    }

    @GetMapping("/assistantWorkType")
    public List<AssistantWorkType> findAssistantWorkType() {
        return assistantWorkService.findAssistantWorkType();
    }
}
