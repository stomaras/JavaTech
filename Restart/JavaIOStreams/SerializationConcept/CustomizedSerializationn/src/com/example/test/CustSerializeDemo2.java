package com.example.test;
import java.io.*;

class Account implements Serializable {

    String username = "durga";
    transient String pwd = "anushka";
    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        String epwd = "123" + pwd; // prepare encrypted password
        os.writeObject(epwd); // write encrypted password to the file
    }

    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        String epwd = (String) is.readObject();
        pwd = epwd.substring(3);
    }
}


public class CustSerializeDemo2 {

    public static void main(String[] args) throws Exception{
        Account a1 = new Account();
        System.out.println(a1.username + "..." + a1.pwd);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\CustomizedSerialization\\src\\com\\example\\test\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\CustomizedSerialization\\src\\com\\example\\test\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account) ois.readObject();
        System.out.println(a2.username+"..."+a2.pwd);
    }
}
