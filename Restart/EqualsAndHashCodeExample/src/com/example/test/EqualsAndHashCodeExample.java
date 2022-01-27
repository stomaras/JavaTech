package com.example.test;

public class EqualsAndHashCodeExample {

    public static void main(String[] args) {
        System.out.println(new Simpson("Homer", 35, 120).equals(new Simpson("Homer",35,120)));
        System.out.println(new Simpson("Bart", 10, 120).equals(new Simpson("El Barto", 10, 45)));
        System.out.println(new Simpson("Lisa", 54, 60).equals(new Object()));
    }

    static class Simpson {

        private String name;
        private int age;
        private int weight;

        public Simpson(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o){
            if (this == o) {
                return true;
            }

            if (o == null || this.getClass() != o.getClass()){
                return false;
            }

            Simpson simpson = (Simpson) o;
            return this.age == simpson.age && weight == simpson.weight && name.equals(simpson.name);
        }
    }
}
