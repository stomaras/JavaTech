package com.example.test;

import java.io.*;

public class Account implements Serializable {
    String username = "durga";
    transient String pwd = "anushka";
    transient int pin = 1234;

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String epwd = "123" + pwd; //
        int epin = 4444 + pin;
        os.writeObject(epwd);
        os.writeInt(epin);
    }

    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String epwd = (String) is.readObject();// read encrypted password
        pwd = epwd.substring(3);// perform decryption of pwd
        int epin = is.readInt(); // read encrypted pin number
        pin = epin-4444;// perform decryption of pin
    }
}

class CustSerializeDemo3{
    public static void main(String[] args) throws Exception{
        Account a1 = new Account();
        System.out.println(a1.username+ "..." +a1.pwd+ "..." + a1.pin);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\CustomizedSerializationInMultipleProperties\\src\\com\\example\\test\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\CustomizedSerializationInMultipleProperties\\src\\com\\example\\test\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account)ois.readObject();
        System.out.println(a2.username+ "..." +a2.pwd+ "..." + a2.pin);
    }
}
