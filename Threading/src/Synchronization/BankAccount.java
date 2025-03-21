package Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is Trying to withdraw amount " + amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    if (amount <= balance) {
                        System.out.println(Thread.currentThread().getName() + " Your Withdrawal is in process ");
                        balance -= amount;

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            System.out.println(Thread.currentThread().getName() + " was interrupted during withdrawal.");
                        }

                        System.out.println(Thread.currentThread().getName() + " Amount Withdrawn. Remaining balance: " + balance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " Please enter an amount below the balance.");
                    }
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Could not access the lock. Try again later.");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " failed to acquire lock: " + e.getMessage());
        }
    }
}
