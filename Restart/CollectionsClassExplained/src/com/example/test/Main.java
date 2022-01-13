package com.example.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // The Collections class provides static methods
        // whose first argument is the collection on which
        // the operation is to performed. The great majority
        // of the algorithms provided by the Java platform operate
        // on List instances, but a few of them operate on orbitary
        // Collection instances. We use Collections class to demonstrate
        // below Algorithms with examples :
        // - Sorting
        // - Shuffing
        // - Routine Data Manipulation
        // - Searching
        // - Composition
        // - Finding Extreme Values
        // The Collections class provides two sorting methods:

        //
        /*
        1) sort(List list) :

         Sorts the specified list into ascending order,
         ,according to the natural ordering of its elements
         all elements in the list must implement
         the Comparable interface


         */

        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 4");
        list.add("element 3");
        Collections.sort(list);
        for (String str : list) {
            System.out.println("Sort elements in ascending order -- " + str);
        }

        /*
            2) sort(List list, Comparator<? super Project> c):

            Sorts the specified list according to the order induced
            by the specified comparator. All elements in the list
            must be mutually comparable using the specified comparator
            (that is, c.compare(e1,e2) must not throw a ClassCastException
            for any elements e1 and e2 in the list).
         */
        sortingCustomObjectsByComparator();

    }

    private static void sortingCustomObjectsByComparator() {
        // Sort Projects by project id in ascending order.
        List<Project> projects = new ArrayList<>();
        Project project = new Project();
        project.setProjectId(100);
        project.setProjectName("TMS");
        projects.add(project);

        Project project2 = new Project();
        project2.setProjectId(200);
        project2.setProjectName("CMS");
        projects.add(project2);

        Project project3 = new Project();
        project3.setProjectId(50);
        project3.setProjectName("CMS");
        projects.add(project3);

        Collections.sort(projects, Comparator.comparing(Project::getProjectName));
    }

    private static void printList(List<Project> projects) {
        for (Project project : projects) {
            System.out.println(project.getProjectId());
            System.out.println(project.getProjectName());
        }
    }
}
