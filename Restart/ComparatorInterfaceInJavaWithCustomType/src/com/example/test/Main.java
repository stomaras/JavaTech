package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 55));
        students.add(new Student(2, 95));
        students.add(new Student(3, 35));
        students.add(new Student(4,45));
        students.add(new Student(5, 85));

        Collections.sort(students, (s1,s2) -> {
            return s1.marks > s2.marks?-1: s1.marks<s2.marks?1:0;
        });

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student
{
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
