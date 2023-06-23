package com.petHospital.learningSystem.service;

import com.petHospital.learningSystem.model.Problem;
import com.petHospital.learningSystem.repository.ProblemRepository;
import org.springframework.stereotype.Service;

@Service
public class ProblemService {
    private final ProblemRepository problemRepository;

    public ProblemService(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }

    public Problem findProblem(int id) {
        return problemRepository.findProblemById(id);
    }

}
