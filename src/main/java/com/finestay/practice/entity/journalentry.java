package com.finestay.practice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Journalentry {
    @Id
    private String id;
    private String name;
    private String working;

    // Getter & Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for working
    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }
}
