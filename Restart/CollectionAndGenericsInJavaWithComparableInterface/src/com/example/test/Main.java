package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Student Object will come back either the number or marks or some different logic by itself that means we do not
    require a comparator , I want to make it possible you have to implement an interface called Comparable
 */


public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 55));
        students.add(new Student(2, 95));
        students.add(new Student(3, 35));
        students.add(new Student(4, 45));
        students.add(new Student(5, 85));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
    class Student implements Comparable<Student>
    {
        int rollno;
        int marks;

        public Student(int rollno, int marks) {
            this.rollno = rollno;
            this.marks = marks;
        }

        public int getRollno() {
            return rollno;
        }

        public int getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", marks=" + marks +
                    '}';
        }

        @Override
        public int compareTo(Student s) {
            return this.marks > s.marks?-1:this.marks<s.marks?1:0;
        }
    }



