package com.company;

// private or public is really useless because the interface , simply tell us the methods which must
// implement by a class. So we can remove public and private access modifiers from the interface ITelephone.
// if you implement this interface you have actually to implement all the methods.

// So interface is there in Abstract level to tell you what methods are valid and have to be actually overriden in
// an actual class.
public interface ITelephone {
    void powerOn();// This is a function of a telephone
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
