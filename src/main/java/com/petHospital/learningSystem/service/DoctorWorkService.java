package com.petHospital.learningSystem.service;

import com.petHospital.learningSystem.model.DoctorWork;
import com.petHospital.learningSystem.model.DoctorWorkType;
import com.petHospital.learningSystem.repository.DoctorWorkRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DoctorWorkService {
    private final DoctorWorkRepository doctorWorkRepository;

    public DoctorWorkService(DoctorWorkRepository doctorWorkRepository) {
        this.doctorWorkRepository = doctorWorkRepository;
    }

    public DoctorWork findDoctorWork(String name) {
        return doctorWorkRepository.findDoctorWorkByName(name);
    }

     public List<DoctorWorkType> findDoctorWorkType() {
         Map<String, List<String>> map = new HashMap<>();
         doctorWorkRepository.findAll().forEach(work -> {
             if (!map.containsKey(work.getType()))
                 map.put(work.getType(), new ArrayList<>());
             map.get(work.getType()).add(work.getName());
         });
         List<DoctorWorkType> list = new ArrayList<>();
         for (Map.Entry<String, List<String>> entry : map.entrySet()) {
             list.add(new DoctorWorkType(entry.getKey(), entry.getValue()));
         }
         return list;
     }
}
