package com.petHospital.learningSystem.controller;


import com.petHospital.learningSystem.model.Problem;
import com.petHospital.learningSystem.service.ProblemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProblemController {
    private final ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping("/problem")
    public Problem findProblem(@RequestParam int id) {
        return problemService.findProblem(id);
    }


}
