package com.petHospital.learningSystem.model;

import java.util.List;

public class DoctorWorkType {
    String type;
    List<String> works;

    public DoctorWorkType(String type, List<String> works) {
        this.type = type;
        this.works = works;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getWorks() {
        return works;
    }

    public void setWorks(List<String> works) {
        this.works = works;
    }
}
