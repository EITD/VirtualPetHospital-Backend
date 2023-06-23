package com.petHospital.learningSystem.repository;

import com.petHospital.learningSystem.model.FrontDeskWork;
import org.springframework.data.repository.CrudRepository;

public interface FrontDeskWorkRepository extends CrudRepository<FrontDeskWork, Integer> {
    FrontDeskWork findFrontDeskWorkByName(String name);
}
