package com.ac.multitenancydemo.controller;

public class TeacherRequestBody {
    private String name;

    public TeacherRequestBody() {
    }

    public TeacherRequestBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
