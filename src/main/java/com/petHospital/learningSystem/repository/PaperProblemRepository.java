package com.petHospital.learningSystem.repository;

import com.petHospital.learningSystem.model.PaperProblem;
import org.springframework.data.repository.CrudRepository;

public interface PaperProblemRepository extends CrudRepository<PaperProblem, Integer> {
    PaperProblem findProblemByPaper(int paper);
}
