
/*

This is the way of writing a program by extending Thread class

public class World extends Thread {

    @Override
    public void run() {
        super.run();
        for (;;){
            System.out.println("World");
        }

    }
}

 */


public class World implements Runnable {


    @Override
    public void run() {
        for(;;){
            System.out.println("World");
        }
    }
}
