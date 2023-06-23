package com.petHospital.learningSystem.service;

import com.petHospital.learningSystem.model.AssistantWork;
import com.petHospital.learningSystem.model.AssistantWorkType;
import com.petHospital.learningSystem.repository.AssistantWorkRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssistantWorkService {
    private final AssistantWorkRepository assistantWorkRepository;

    public AssistantWorkService(AssistantWorkRepository assistantWorkRepository) {
        this.assistantWorkRepository = assistantWorkRepository;
    }

    public AssistantWork findAssistantWork(String name) {
        return assistantWorkRepository.findAssistantWorkByName(name);
    }

    public List<AssistantWorkType> findAssistantWorkType() {
        Map<String, List<String>> map = new HashMap<>();
        assistantWorkRepository.findAll().forEach(work -> {
            if(!map.containsKey(work.getType()))
                map.put(work.getType(), new ArrayList<>());
            map.get(work.getType()).add(work.getName());
        });
        List<AssistantWorkType> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            list.add(new AssistantWorkType(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}
