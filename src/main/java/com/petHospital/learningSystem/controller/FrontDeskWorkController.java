package com.petHospital.learningSystem.controller;

import com.petHospital.learningSystem.model.DoctorWork;
import com.petHospital.learningSystem.model.FrontDeskWork;
import com.petHospital.learningSystem.model.FrontDeskWorkType;
import com.petHospital.learningSystem.service.FrontDeskWorkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FrontDeskWorkController {
    private final FrontDeskWorkService frontDeskWorkService;

    public FrontDeskWorkController(FrontDeskWorkService frontDeskWorkService) {
        this.frontDeskWorkService = frontDeskWorkService;
    }

    @GetMapping("/frontdeskWork")
    public FrontDeskWork findFrontDeskWork(String name) {
        return frontDeskWorkService.findFrontDeskWork(name);
    }

    @GetMapping("/frontdeskWorkType")
    public List<FrontDeskWorkType> findFrontDeskWorkType() {
        return frontDeskWorkService.findFrontDeskWorkType();
    }
}
