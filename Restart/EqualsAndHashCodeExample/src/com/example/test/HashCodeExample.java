package com.example.test;

public class HashCodeExample {

    public static void main(String[] args) {

    }

    static class Simpson {
        int id;
        String name;

        public Simpson(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }

            Simpson simpson = (Simpson) obj;
            return this.id == simpson.id && name.equals(simpson.name);
        }


    }
}
