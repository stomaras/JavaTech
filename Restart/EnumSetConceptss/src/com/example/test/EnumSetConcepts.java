package com.example.test;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

    enum Lang {
        JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY
    }

    public static void main(String[] args) {

        // created anew enumset using enum
        EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
        System.out.println(langs);

        // create an empty enum set:
        EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
        System.out.println(l);

        // range(e1,e2):
        EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.PYTHON);
        System.out.println(enumRange);

        // of:
        EnumSet<Lang> CSharpEnum = EnumSet.of(Lang.CSHARP);
        System.out.println(CSharpEnum);

        EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVASCRIPT, Lang.JAVA);
        System.out.println(multipleEnum);

        // add and addAll():
        EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
        EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
        lang2.add(Lang.JAVASCRIPT);
        System.out.println(lang2);
        lang2.addAll(lang1);
        System.out.println(lang2);

        // how to iterate EnumSet: iterator:
        EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
        Iterator<Lang> it = fullLang.iterator();
        System.out.println("------------------EnumSet Iteration--------------------");
        while (it.hasNext()) {
            System.out.print(" " + it.next());
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");



    }
}
