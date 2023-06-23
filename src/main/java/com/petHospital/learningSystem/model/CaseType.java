package com.petHospital.learningSystem.model;

import java.util.List;

public class CaseType {
    String type;
    List<String> cases;

    public CaseType(String type, List<String> cases) {
        this.type = type;
        this.cases = cases;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getCases() {
        return cases;
    }

    public void setCases(List<String> cases) {
        this.cases = cases;
    }
}
