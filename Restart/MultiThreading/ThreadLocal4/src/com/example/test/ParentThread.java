package com.example.test;
/*

 */
public class ParentThread extends Thread{
    // with curly braces i create anonymous inner class which extends
    // InheritableThreadLocal
    public static InheritableThreadLocal tl = new InheritableThreadLocal() {
        public Object childValue(Object p){
            return "CC";
        }
    };

    public void run()
    {
        tl.set("pp");
        System.out.println("Parent Thread Value--" + tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread{
    public void run(){
        System.out.println("Child Thread Value---" + ParentThread.tl.get());
    }
}
