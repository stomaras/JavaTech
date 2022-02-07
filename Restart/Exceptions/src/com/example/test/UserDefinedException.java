package com.example.test;

public class UserDefinedException {

    public static void main(String[] args) {

        int i = 5;
        try {
            if (i < 10) {
                throw new MyException("Erorrrrrrr");
            }
        }catch (MyException e) {
            System.out.println(e);
        }
    }
}
class MyException extends Exception
{
    public MyException(String msg){
        super(msg);
    }
}
