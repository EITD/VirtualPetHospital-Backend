package com.petHospital.learningSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_problem")
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String question;
    private String options;
    private String answer;

    public Problem() {
    }

    public Problem(Integer id, String type, String question, String options, String answer) {
        this.id = id;
        this.type = type;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
