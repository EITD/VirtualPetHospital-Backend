package com.petHospital.learningSystem.repository;

import com.petHospital.learningSystem.model.AssistantWork;
import org.springframework.data.repository.CrudRepository;

public interface AssistantWorkRepository extends CrudRepository<AssistantWork, Integer> {
    AssistantWork findAssistantWorkByName(String name);
}
