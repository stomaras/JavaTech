package com.example.test;

public class Main {
    /**
     * Inheritance: is-a relationship
     *
     * 1) Single Inheritance: refers to  child and parent class relationship where
     *                        a class extends the another class. This involves only 2
     *                        classes where 1 is parent and another is a child.
     *
     * 2) Multilevel Inheritance: Refers to a child and parent relationship where a super
     *                            child class extends the child class. For example class
     *                            child2 extends child1 and child1 extends class Parent.
     *                            For exmple we have an Animal and Dog is the child of this
     *                            Animal and the third child can be Labrador (with special
     *                            athletic capabilities)
     *
     * 3) Hierarchical Inheritaance: Refers to a child and parent class relationship
     *                               where more than one classes extends the same class
     *                               e.g Parent -> Animal and i can have 3 childs such as
     *                               e.g Child1 -> Dog
     *                               e.g Child2 -> Fish
     *                               e.g Child3 -> Frog
     *
     * 4) Hybrid Inheritance : Combination of more than one types of inheritance in a
     *                         single program
     *
     * 5) Multiple Inheritance : One class extending more than one classes, which means
     *                           a child class has two parent classes.
     *                           For example Amphibians animals such as frog are the animals
     *                           which can live both in land and water
     *                           So one class extending properties of two classes
     *                           Terrestial Animals have lungs to breathe
     *                           Aquatic Animals have gills to breathe
     *                           Note!!! Multiple Inheritance is not allowed in java
     */
    public static void main(String[] args) {
	// write your code here

        System.out.println("Static Polymorphism Example: ");
        System.out.println("--------------------------------------");
        StaticPolymorphism staticpol = new StaticPolymorphism();
        staticpol.add(2, 3);

        StaticPolymorphism staticpol2 = new StaticPolymorphism();
        staticpol2.add(2,3,4);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        /*
        Dynamic Polymorphism,
         */
        System.out.println("Dynamic Polymorphism: ");
        System.out.println("------------------------------");
        Dog dog = new Dog();
        dog.specialCapabilities();

        Lambrador lambrador = new Lambrador();
        lambrador.specialCapabilities();
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        System.out.println("Upcasting: ");
        System.out.println("------------------------------");
        // Reference is given to Dog class and memory is given to Lambrador class
        Dog dog1 = new Lambrador();
        dog1.specialCapabilities();
    }
}
