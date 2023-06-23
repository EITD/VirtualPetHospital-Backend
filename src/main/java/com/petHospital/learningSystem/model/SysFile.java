package com.petHospital.learningSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sys_file")
public class SysFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private long size;
    private String url;
    @Column(name = "is_delete")
    private int isDelete;
    private int enable;
    private String md5;

    public SysFile() {
    }

    public SysFile(int id, String name, String type, long size, String url, int isDelete, int enable, String md5) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.url = url;
        this.isDelete = isDelete;
        this.enable = enable;
        this.md5 = md5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
