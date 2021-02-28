package synchronization;

import sun.awt.windows.ThemeReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Display {

    public void display() {
        for (int i =0;i<10;i++)
        System.out.println(Thread.currentThread().getName()+ "m1");
    }

    public void displayc(){
        for (int i =0;i<10;i++)
        System.out.println( Thread.currentThread().getName() + "m3");
    }


    public void displayn(){

        synchronized(Display.class){
            try{
                System.out.println(Thread.currentThread().getName()+ "before sleep");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+ "after sleep");
            }catch (InterruptedException e){
                System.out.println("interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            for (int i = 0; i < 1; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + "::" + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        }
    }



    public synchronized static void wish(String name){
        for (int i =0;i<10;i++){
            System.out.print("Good Morning:");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("interrupted");
            }
            System.out.println(name);
        }
    }
}
