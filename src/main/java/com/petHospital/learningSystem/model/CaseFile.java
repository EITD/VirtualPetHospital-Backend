package com.petHospital.learningSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "case_files")
public class CaseFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "case_id")
    private int caseId;
    private int entry;
    @Column(name = "file_id")
    private int fileId;

    public CaseFile() {
    }

    public CaseFile(int id, int caseId, int entry, int fileId) {
        this.id = id;
        this.caseId = caseId;
        this.entry = entry;
        this.fileId = fileId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }
}
