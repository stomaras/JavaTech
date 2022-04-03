class MyThread extends Thread
{
    public void run()
    {
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){

            }
        }

    }
}

public class DeamonThreadDemo {

    public static void main(String[] args) throws InterruptedException{
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        System.out.println("end of main thread");
    }
}
