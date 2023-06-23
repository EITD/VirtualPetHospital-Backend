package com.petHospital.learningSystem.service;

import com.petHospital.learningSystem.model.PaperProblem;
import com.petHospital.learningSystem.repository.PaperProblemRepository;
import org.springframework.stereotype.Service;

@Service
public class PaperProblemService {
    private final PaperProblemRepository paperProblemRepository;

    public PaperProblemService(PaperProblemRepository paperProblemRepository) {
        this.paperProblemRepository = paperProblemRepository;
    }

    public PaperProblem findPaperProblem(int paper) {
        return paperProblemRepository.findProblemByPaper(paper);
    }

}
