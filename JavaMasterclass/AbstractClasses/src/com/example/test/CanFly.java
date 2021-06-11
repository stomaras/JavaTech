package com.example.test;

// One way to think of an interface, is to name it what it is.
// So in other words in this case it is the can fly interface,
// We don't add an I in front of Interface because it actually
// adding an extra fluff to our code. So it could potentially be making code harder to read
//
// So we can have a bat class, and a dragon fly class that inherit from a suitable
// base class, and both could then implement the canFly interface.
// So by adding the canFly() interface, we are actually adding more flexibility
// into the design, to enable us to create other classes and we are not gonna fall
// victim to the potential problems you would have had trying to get everything to fit
// into the one class as we did earlier.
public interface CanFly {
    void fly();
}
