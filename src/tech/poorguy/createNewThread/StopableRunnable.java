package tech.poorguy.createNewThread;

public class StopableRunnable implements Runnable {
    private boolean run=false;
    public synchronized void stopIt(){
        run=true;
    }
    private synchronized boolean isAliving(){
        return run==false;
    }
    @Override
    public void run() {
        while(isAliving()){
            System.out.println("Thread is still aliving");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
