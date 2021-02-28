package thread;

public class Main {
    static MyThread t2;
    public static void main(String args[]) throws InterruptedException {
       MyThread mythread = new MyThread();
//        mythread.setPriority(10);
      mythread.start();
      mythread.sleep(5000);
//        mythread.testStatic();


        //t2 = new MyThread();
        //t2.start();
        //t2.sleep(1,1);

        /*MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread t = new Thread(myRunnableThread);
        t.setPriority(9);
        t.start();*/
        //t.sleep(2000,9);

        // Thread.sleep(100000);

        //t.join();
        //mythread.join();

        /*Thread tn = new Thread("Shivangi");
        tn.start();*/

        for(int i =0;i<10;i++) {
            Thread.sleep(2000);
            System.out.println("Inside Main Thread");
        }
    }
}
