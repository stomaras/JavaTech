package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassExample {

    public static void main(String[] args) {
        sortingCustomObjectsByComparator();
    }

    private static void sortingCustomObjectsByComparator() {
        // Sort Projects by project id in ascending order.
        List<Project> projects = new ArrayList<>();
        Project project = new Project();
        project.setProjectId(100);
        project.setProjectName("TMS");
        project.setPrice(2000);
        projects.add(project);

        Project project2 = new Project();
        project2.setProjectId(200);
        project2.setProjectName("CMS");
        project2.setPrice(1000);
        projects.add(project2);

        Project project3 = new Project();
        project3.setProjectId(50);
        project3.setProjectName("CMS");
        project3.setPrice(4089);
        projects.add(project3);

        Collections.sort(projects, Comparator.comparing(Project::getPrice));
        printList(projects);
    }

    public static void printList(List<Project> projects) {
        for (Project project : projects) {
            System.out.println(project.getProjectId());
            System.out.println(project.getProjectName());
        }
    }
}
