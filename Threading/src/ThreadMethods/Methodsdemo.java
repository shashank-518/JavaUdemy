package ThreadMethods;

public class Methodsdemo extends Thread {

    public Methodsdemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i =0; i<5;i++){
            System.out.println(Thread.currentThread().getName() + " is Running");
            Thread.yield();
        }
    }


    public static void main(String[] args) {

        Methodsdemo t1 = new Methodsdemo("t1");
        Methodsdemo t2 = new Methodsdemo("t2");

        t1.start();
        t2.start();


    }

}


/*

We can set Priority of any thread

The min Priority is 1 and the max priority is 10 and the norm priority is 5


 */