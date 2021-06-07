package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ISaveable p;
        p = new Player();
        List<String> list = p.write();
        p.read(list);
    }
}
