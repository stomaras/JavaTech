package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;
        timsPhone = new DeskPhone(12333,true);
        timsPhone.powerOn();
        timsPhone.answer();
        timsPhone.isRinging();
    }
}
