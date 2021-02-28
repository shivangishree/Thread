package synchronization;

import java.io.FileNotFoundException;

public class SyncThread extends Thread{

    Display d;
    Th1 th1;
    SyncThread(Display d, Th1 th1){
        this.d = d;
        this.th1 = th1;
    }
    void test()throws FileNotFoundException{

    }
    public void run()  {
        d.display();
        th1.printTH1();


    }
}
