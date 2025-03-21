package ThreadMethods;

public class DeamonDemo extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println("Hello World!!");
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        DeamonDemo d1 = new DeamonDemo();
        d1.setDaemon(true);
        DeamonDemo d2 = new DeamonDemo();
        d2.setDaemon(true);
        d2.start();
        d1.start();
        System.out.println("Main Done");
    }
}
