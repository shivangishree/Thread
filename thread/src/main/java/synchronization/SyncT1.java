package synchronization;

public class SyncT1 extends Thread {

    SyncT1(){

    }

    Display d;
    SyncT1(Display d){
        this.d = d;
    }

    public void run(){
        //System.out.println(Thread.currentThread().getName());
        d.displayn();
    }
}
