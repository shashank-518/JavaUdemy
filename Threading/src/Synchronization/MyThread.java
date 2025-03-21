package Synchronization;

public class MyThread extends Thread{

    private final Counter count;

    public MyThread(Counter count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0 ;i< 1000; i++){
            count.increment();
        }
    }
}
