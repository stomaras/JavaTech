package com.example.test;

final public class Student {

    final private String studentName;
    final private int id;
    final private Address address;

    public Student(int id, String studentName, Address address) {
        this.studentName = studentName;
        this.id = id;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
