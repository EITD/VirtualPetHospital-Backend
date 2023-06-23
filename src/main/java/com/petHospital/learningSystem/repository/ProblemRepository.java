package com.petHospital.learningSystem.repository;


import com.petHospital.learningSystem.model.Problem;
import org.springframework.data.repository.CrudRepository;

public interface ProblemRepository extends CrudRepository<Problem, Integer> {
    Problem findProblemById(int id);
}
