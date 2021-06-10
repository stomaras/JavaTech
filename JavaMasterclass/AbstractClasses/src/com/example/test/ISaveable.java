package com.example.test;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    // Is not complete abstraction with ArrayList, we must declare List
    // in order to have complete abstraction.
    // List is an interface which the other classes such as ArrayLists within Java e.t.c
    // actually have to implement to actually use.
    // Now obviously by definition an interface is abstract, so you can not use a new
    // ISaveable or a new list.
    //
    // Java also allows abstract classes
    // in order to add further flexibility to our classes which implements our interface
    // we can not declare List<String>, but only List
    // So as i mentioned, interfaces are by definition, in java, Abstarct.
    // So you can not use the new ISaveable or new list. You have to instantiate a class
    // that implements the interface.
    List<String> write();
    void read(List<String> savedValues);
}
