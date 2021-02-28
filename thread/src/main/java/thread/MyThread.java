package thread;

public class MyThread extends Thread {
    public void run(){
        //Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getName());
        for(int i =0;i<10;i++){
            System.out.println("Inside Child Thread");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

        //System.out.println(Thread.currentThread().getName());
    }

    public void testStatic(){
        System.out.println("Test");
    }
}
