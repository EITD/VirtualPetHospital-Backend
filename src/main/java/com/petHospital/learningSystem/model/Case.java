package com.petHospital.learningSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_case")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tag;
    private String name;
    private String conditions;
    private String checks;
    private String diagnosis;
    private String treatment;

    public Case() {
    }

    public Case(Integer id, String tag, String name, String condition, String check, String diagnosis, String treatment) {
        this.id = id;
        this.tag = tag;
        this.name = name;
        this.conditions = condition;
        this.checks = check;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getChecks() {
        return checks;
    }

    public void setChecks(String check) {
        this.checks = checks;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
