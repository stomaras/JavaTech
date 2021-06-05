package com.company;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber, boolean isRinging, boolean isOn) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Press enter button to power on...");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("Now ringing ");
        }else{
            System.out.println("Phone is switched off");
        }

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
        if (phoneNumber == myNumber && isOn){
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
