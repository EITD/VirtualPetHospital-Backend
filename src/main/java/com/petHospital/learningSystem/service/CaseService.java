package com.petHospital.learningSystem.service;

import com.petHospital.learningSystem.model.Case;
import com.petHospital.learningSystem.model.CaseEntry;
import com.petHospital.learningSystem.model.CaseType;
import com.petHospital.learningSystem.model.SysFile;
import com.petHospital.learningSystem.repository.CaseFileRepository;
import com.petHospital.learningSystem.repository.CaseRepository;
import com.petHospital.learningSystem.repository.SysFileRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CaseService {
    private final CaseRepository caseRepository;
    private final CaseFileRepository caseFileRepository;
    private final SysFileRepository sysFileRepository;

    public CaseService(CaseRepository caseRepository, CaseFileRepository caseFileRepository, SysFileRepository sysFileRepository) {
        this.caseRepository = caseRepository;
        this.caseFileRepository = caseFileRepository;
        this.sysFileRepository = sysFileRepository;
    }

    public CaseEntry findCaseEntry(String name, int entry) {
        Case c = caseRepository.findCaseByName(name);
        String text = switch (entry) {
            case 1 -> c.getConditions();
            case 2 -> c.getChecks();
            case 3 -> c.getDiagnosis();
            case 4 -> c.getTreatment();
            default -> "";
        };
        List<String> src = new ArrayList<>();
        caseFileRepository.findCaseFileByCaseIdAndEntry(c.getId(), entry).forEach(
                caseFile -> {
                    SysFile sysFile = sysFileRepository.findSysFilesById(caseFile.getFileId());
                    src.add(sysFile.getUrl());
                });
        return new CaseEntry(text, src);
    }

    public List<CaseType> findCaseType() {
        Map<String, List<String>> map = new HashMap<>();
        caseRepository.findAll().forEach(item -> {
            if(!map.containsKey(item.getTag()))
                map.put(item.getTag(), new ArrayList<>());
            map.get(item.getTag()).add(item.getName());
        });
        List<CaseType> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            list.add(new CaseType(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}
