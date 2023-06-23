package com.petHospital.learningSystem.repository;

import com.petHospital.learningSystem.model.CaseFile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CaseFileRepository extends CrudRepository<CaseFile, Integer> {
    List<CaseFile> findCaseFileByCaseIdAndEntry(int case_id, int entry);
}
