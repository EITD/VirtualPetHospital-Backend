package com.petHospital.learningSystem.repository;

import com.petHospital.learningSystem.model.Case;
import org.springframework.data.repository.CrudRepository;

public interface CaseRepository extends CrudRepository<Case, Integer> {
    Case findCaseByName(String name);
}
