package com.example.test;


public class Project implements Comparable<Project>{
    private int projectId;
    private String projectName;

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

    @Override
    public int compareTo(Project project) {
        return this.getProjectId() - project.getProjectId();
    }
}
