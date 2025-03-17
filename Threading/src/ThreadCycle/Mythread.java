package ThreadCycle;

public class Mythread extends Thread{

    @Override
    public void run() {
        System.out.println("Running");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Mythread my = new Mythread();
        System.out.println(my.getState());
        my.start();

        System.out.println(my.getState());
        Thread.sleep(100);
        System.out.println(my.getState());
        my.join();
        System.out.println(my.getState());


    }




}
