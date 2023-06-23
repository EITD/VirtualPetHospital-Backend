package com.petHospital.learningSystem.service;

import com.petHospital.learningSystem.model.FrontDeskWork;
import com.petHospital.learningSystem.model.FrontDeskWorkType;
import com.petHospital.learningSystem.repository.FrontDeskWorkRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FrontDeskWorkService {
    private final FrontDeskWorkRepository frontDeskWorkRepository;

    public FrontDeskWorkService(FrontDeskWorkRepository frontDeskWorkRepository) {
        this.frontDeskWorkRepository = frontDeskWorkRepository;
    }

    public FrontDeskWork findFrontDeskWork(String name) {
        return frontDeskWorkRepository.findFrontDeskWorkByName(name);
    }

    public List<FrontDeskWorkType> findFrontDeskWorkType() {
        Map<String, List<String>> map = new HashMap<>();
        frontDeskWorkRepository.findAll().forEach(work -> {
            if (!map.containsKey(work.getType()))
                map.put(work.getType(), new ArrayList<>());
            map.get(work.getType()).add(work.getName());
        });
        List<FrontDeskWorkType> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            list.add(new FrontDeskWorkType(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}
