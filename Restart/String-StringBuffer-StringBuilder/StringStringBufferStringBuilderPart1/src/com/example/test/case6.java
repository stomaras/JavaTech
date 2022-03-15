package com.example.test;

public class case6 {

    public static void main(String[] args) {
        String s = new String("Tomy");
        System.out.println(s.charAt(3));
        //System.out.println(s.charAt(45));
        //StringIndexOutOfBoundsException
        s = s.concat("Spyros");
        System.out.println(s);
        s = s + "software";
        System.out.println(s);
        s += "engineer";
        System.out.println(s);

        String s1 = "DURGA";
        System.out.println(s1.equals("durga"));


        String s3 = "DURGA";
        System.out.println(s3.equals("durga"));
        System.out.println(s3.equalsIgnoreCase("durga"));

        String s5 = "";
        System.out.println(s5.isEmpty());

        String s6 = "durga";
        System.out.println(s6.isEmpty());

        String s7 = "tom";
        System.out.println(s7.isEmpty());
        System.out.println(s7.length());

        String s8 = "tomtomtom";
        System.out.println(s8.replace('o', 'a'));

        String s9 = "SpyrosTomaras";
        System.out.println(s9.substring(6));
        System.out.println(s9.indexOf('a'));

        String durga = "durga";
        System.out.println(durga.indexOf('c'));

        String tom = "SpyrosTom";
        System.out.println(tom.lastIndexOf('o'));
    }
}
