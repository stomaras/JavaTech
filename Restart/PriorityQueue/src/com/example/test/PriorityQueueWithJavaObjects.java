package com.example.test;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}

class EmpComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.salary - e1.salary;
    }
}

public class PriorityQueueWithJavaObjects {

    public static void main(String[] args) {
        /*
        inserion order in priority queue always ascending order
         */
        EmpComparator comparator = new EmpComparator();
        PriorityQueue<Employee> pr = new PriorityQueue<>(10, comparator);
        pr.add(new Employee("A", 300));
        pr.add(new Employee("B", 200));
        pr.add(new Employee("C", 4000));
        pr.add(new Employee("D", 50));
        pr.add(new Employee("E", 10));
        pr.add(new Employee("F", 3500));
        pr.add(new Employee("G", 50000));

        // poll means fetch the value or remove the value from this particular PriorityQueue
        System.out.println(pr.poll());
        System.out.println(pr);
    }
}
