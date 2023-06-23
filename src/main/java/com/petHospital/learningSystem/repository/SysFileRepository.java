package com.petHospital.learningSystem.repository;

import com.petHospital.learningSystem.model.SysFile;
import org.springframework.data.repository.CrudRepository;

public interface SysFileRepository extends CrudRepository<SysFile, Integer> {
    SysFile findSysFilesById(int id);
}
