package ThreadMethods;

public class Methodsdemo extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Methodsdemo t1 = new Methodsdemo();
        t1.start();
        t1.join();
        System.out.println("Hello");
    }

}
