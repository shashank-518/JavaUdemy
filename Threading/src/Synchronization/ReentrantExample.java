package Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {

        lock.lock();
        try {

            InnerMethod();
            System.out.println("Outer Method");
        } finally {
            lock.unlock();
        }
    }

    public void InnerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
       ReentrantExample example = new ReentrantExample();
       example.outerMethod();
    }


}
