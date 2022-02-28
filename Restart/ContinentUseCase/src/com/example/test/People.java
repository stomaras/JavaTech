package com.example.test;

import java.util.Objects;

public class People implements Comparable<People>{
    private String firstName;
    private String lastName;
    private int height;
    private String sex;
    private String color;

    public People(String firstName, String lastName ,int height, String sex ,String color) {
        this.firstName = firstName;
        this.lastName = lastName;
        addSex(sex);
        addHeight(height);
        addColor(color);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(People people) {
        return Integer.compare(getHeight(), people.getHeight());
    }

    public boolean addSex(String sex){
        if (sex == "Male" || sex.equals("female") || sex.equals("trans")){
            this.sex = sex;
            return true;
        } else {
            return false;
        }
    }


    public boolean addHeight(int height){
        if (height <= 10 || height > 300){
            return false;
        } else {
            this.height = height;
            return true;
        }
    }

    public boolean addColor(String color){
        if ((color == "White") || (color == "Black") || (color == "Red") || (color == "Yellow")){
            this.color = color;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        People people = (People) o;
        if (people.getFirstName().equals(this.getFirstName()) && (people.getLastName().equals(this.getLastName()))){
            if (people.getHeight() == this.getHeight()){
                if (people.getSex() == this.getSex()){
                    if (people.getColor() == this.getColor()){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, height, color);
    }

    @Override
    public String toString() {
        return "People with  first name : " + firstName + ", with last name: " + lastName + ", with height: " + height + "cm, with color: " + color + "\n";
    }


}
