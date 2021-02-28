package synchronization;

public class Th1 {

     synchronized void printTH1(){
         for (int i =0;i<10;i++)
        System.out.println(Thread.currentThread().getName()+"m3");
    }
}
