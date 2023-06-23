package com.petHospital.learningSystem.repository;

import com.petHospital.learningSystem.model.DoctorWork;
import org.springframework.data.repository.CrudRepository;

public interface DoctorWorkRepository extends CrudRepository<DoctorWork, Integer> {
    DoctorWork findDoctorWorkByName(String name);
}
