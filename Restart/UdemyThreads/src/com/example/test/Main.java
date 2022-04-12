package com.example.test;

public class Main {

    /*
    The decision for the priority in terms of which threads are running
    even though we can influence it to a degree by setting a threads priority,
    it's up to the system itself to schedule when those threads will ultimately run
    Now rather than creating a named class for the other thread, we could also have created
    an anonymous class and this is useful if you are only ever going to want to run the code once.
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread.");

        // instance of a thread
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        // way to create an anonymous class

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_RED + "Another Thread terminated, so I'm running again");
                }catch (InterruptedException e){
                    System.out.println(ThreadColor.ANSI_RED + "I could not wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread");

    }
}
