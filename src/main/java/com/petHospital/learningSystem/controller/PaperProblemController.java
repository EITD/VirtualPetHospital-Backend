package com.petHospital.learningSystem.controller;


import com.petHospital.learningSystem.model.PaperProblem;
import com.petHospital.learningSystem.service.PaperProblemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PaperProblemController {
    private final PaperProblemService paperProblemService;

    public PaperProblemController(PaperProblemService paperProblemService) {
        this.paperProblemService = paperProblemService;
    }

    @GetMapping("/paperproblem")
    public PaperProblem findPaperProblem(@RequestParam int paper) {
        return paperProblemService.findPaperProblem(paper);
    }


}
