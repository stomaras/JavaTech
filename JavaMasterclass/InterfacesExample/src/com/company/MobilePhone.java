package com.company;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    @Override
    public void powerOn() {
        System.out.println("Press enter button to power on...");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on mobile ");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            return isRinging;
        } else {
            isRinging = false;
            return isRinging;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
