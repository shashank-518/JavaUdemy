package Synchronization;

public class BankAccount {

    private int balance = 100;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is Trying to withdraw amount " + amount);

        if(amount <= balance){
            System.out.println(Thread.currentThread().getName() + " Your Withdrawal is in process ");
            balance -= amount;

            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Amount Withdraw done " + balance);


        }
        else{
            System.out.println(Thread.currentThread().getName() + " Please enter the Amount Below the balance");

        }

    }


}
