package com.petHospital.learningSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "paper_problems")
public class PaperProblem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paper;
    private String problems;
    private Integer score;

    public PaperProblem() {
    }

    public PaperProblem(Integer paper, String problems, Integer score) {
        this.paper = paper;
        this.problems = problems;
        this.score =score;
    }

    public Integer getPaper() {
        return paper;
    }

    public void setPaper(Integer paper) {
        this.paper = paper;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    public Integer getScore() {
        return score;
    }

    public void setQuestion(Integer score) {
        this.score = score;
    }


}
