package synchronization;

public class SyncT2 extends Thread{

    Display d;
    SyncT2(Display d){
      this.d = d;
    }

    public void run(){
        d.displayc();
    }
}
