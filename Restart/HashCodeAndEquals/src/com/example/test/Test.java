package com.example.test;

public class Test {

    public static void main(String[] args) {
//        Human tom = new Human(1, "Spyros");
//        int hashcodeValueOfTomObject = tom.hashCode();
//        System.out.println("tom object hashcode is : " + hashcodeValueOfTomObject);
//
//        Human chris = new Human(2, "Chris");
//        int hashcodeValueOfChrisObject = chris.hashCode();
//        System.out.println("chris object hashcode is : " + hashcodeValueOfChrisObject);

        String tom = new String("Tom");
        int tomHashcodeValue = tom.hashCode();
        System.out.println("hashcode value of tom " + tomHashcodeValue);

        String evi = new String("Evi");
        int eviHashcodeValue = evi.hashCode();
        System.out.println("hashcode value of tom " + eviHashcodeValue);

        String str1 = "FB";
        String str2 = "Ea";
        System.out.println(str1.hashCode() + " " + str2.hashCode());
    }
}
