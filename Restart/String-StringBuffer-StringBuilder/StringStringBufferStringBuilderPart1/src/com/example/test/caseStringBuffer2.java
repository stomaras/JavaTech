package com.example.test;

public class caseStringBuffer2 {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Tom");

        sb1.insert(0, "Spyros");
        System.out.println(sb1);

        sb1.delete(3, 8);
        System.out.println(sb1);

        sb1.deleteCharAt(3);
        System.out.println(sb1);

        StringBuffer chris = new StringBuffer("Chris");
        chris.reverse();
        System.out.println(chris);

        StringBuffer sbb = new StringBuffer("XristosKanas");
        sbb.setLength(8);
        System.out.println(sbb);

        StringBuffer ss = new StringBuffer();
        System.out.println(ss.capacity());
        ss.ensureCapacity(1000);
        System.out.println(ss.capacity());

    }
}
