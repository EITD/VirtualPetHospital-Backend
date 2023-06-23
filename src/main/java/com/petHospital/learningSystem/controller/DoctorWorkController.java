package com.petHospital.learningSystem.controller;

import com.petHospital.learningSystem.model.DoctorWork;
import com.petHospital.learningSystem.model.DoctorWorkType;
import com.petHospital.learningSystem.service.DoctorWorkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorWorkController {
    private final DoctorWorkService doctorWorkService;

    public DoctorWorkController(DoctorWorkService doctorWorkService) {
        this.doctorWorkService = doctorWorkService;
    }

    @GetMapping("/doctorWork")
    public DoctorWork findDoctorWork(@RequestParam String name) {
        return doctorWorkService.findDoctorWork(name);
    }

    @GetMapping("/doctorWorkType")
    public List<DoctorWorkType> findDoctorWorkType() {
        return doctorWorkService.findDoctorWorkType();
    }
}
