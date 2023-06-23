package com.petHospital.learningSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_assistant_work")
public class AssistantWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private String description;
    private String src;

    public AssistantWork() {
    }

    public AssistantWork(Integer id, String name, String type, String description, String src) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.src = src;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
