package com.petHospital.learningSystem.model;

import java.util.List;

public class CaseEntry {
    String text;
    List<String> src;

    public CaseEntry(String text, List<String> src) {
        this.text = text;
        this.src = src;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getSrc() {
        return src;
    }

    public void setSrc(List<String> src) {
        this.src = src;
    }
}
