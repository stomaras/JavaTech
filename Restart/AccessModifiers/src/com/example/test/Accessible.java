package com.example.test;

public interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

    /*
        Challenege:
        In the following interface declaration, what is the visibility of:
        1. the Accessible interface ?
        2. the int variable SOME_CONSTANT?
        3. methodA?
        4. methodB and methodC?

        Hint: think back to the lecture on interfaces before answering
     */

    /*
        Number 1: The Accessible interface, is set to package-private, so in other words, it's accessible to all classes, in this case, in the com.example.test
                  package
        Number 2: the int SOME_CONSTANT all interface variables are public static final
        Number 3: methodA is public
        Number 4: methodB and methodC are public because all interface methods are automatically public

        NOTE !!! it is not possible to have anything except public methods in an interface

     */


}
