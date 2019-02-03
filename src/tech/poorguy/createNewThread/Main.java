package tech.poorguy.createNewThread;

public class Main {
    public static void main(String[] args){
        Thread thread1=new MyThread();
        thread1.start();
        Thread thread2=new MyThread(){
            @Override
            public void run() {
                System.out.println("thread2 runs");
            }
        };
        thread2.start();
        Thread thread3=new Thread(new MyRunnable());
        thread3.start();
        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread4");
            }
        });
        thread4.start();
        Thread thread5 = new Thread(() -> {
            System.out.println("thread5");
        });
        thread5.start();
        StopableRunnable stopableRunnable=new StopableRunnable();
        Thread thread6=new Thread(stopableRunnable);
        thread6.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopableRunnable.stopIt();
    }
}
