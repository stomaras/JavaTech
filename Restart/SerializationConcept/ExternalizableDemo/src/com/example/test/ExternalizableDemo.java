package com.example.test;

import java.io.*;

public class ExternalizableDemo implements Externalizable {

    String s;
    int i;
    int j;

    public ExternalizableDemo() {
        System.out.println("public no arg-constructor");
    }

    public ExternalizableDemo(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String) in.readObject();
        i = in.readInt();
    }

    public static void main(String[] args) throws Exception{
        ExternalizableDemo t1 = new ExternalizableDemo("spyros", 10, 20);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\ExternalizableDemo\\src\\com\\example\\test\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t1);

        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\ExternalizableDemo\\src\\com\\example\\test\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizableDemo t2 = (ExternalizableDemo) ois.readObject();
        System.out.println(t2.s + "..." + t2.i + "..." + t2.j);
    }
}
