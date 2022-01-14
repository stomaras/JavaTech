package com.example.test;


public class Project implements Comparable<Project>{
    private int projectId;
    private String projectName;
    private int price;

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Project project) {
        return this.getPrice() - project.getPrice();
    }
}
