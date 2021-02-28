package synchronization;

import java.io.FileNotFoundException;

public class SynMain {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        Display obj1 = new Display();
        Th1 th1 = new Th1();

        SyncThread t0 = new SyncThread(obj1,th1);
        t0.start();

        SyncThread t3 = new SyncThread(obj1,th1);
        t3.start();

        SyncT2 t2 = new SyncT2(obj1);
        t2.start();

        /*Display d = new Display();
        Display d2 = new Display();

        SyncT1 t3 = new SyncT1(d);
        SyncT1 t4 = new SyncT1(d2);
        SyncT1 t5 = new SyncT1(d);

        t3.start();
        t4.start();
        t5.start();*/

        /*
        SyncT2 t4 = new SyncT2(d);
        Thread t = new Thread(t3);
        Thread t$ = new Thread(t4);

        t.start();
        t$.start();
        t.join();
        t$.join();*/

        /*SyncThread t1 = new SyncThread(d,"Shivangi");
        t1.start();

        SyncThread t2 = new SyncThread(d2,"Shree");
        t2.start();*/
    }
}
