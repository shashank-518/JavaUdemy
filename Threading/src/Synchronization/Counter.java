package Synchronization;

public class Counter {

    private int count;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

}

/*

    public synchronized void increment(){
        count++;
    }

    This is the way to make method synchronized
    we can even make a part of a block synchronized
    like this

    public void increment(){
        synchronized{
            count++
        }
    }

    if we use synchronized key word and two thread are sharing a single resource it will allow only one thread to take
    run at a time hence getting the desired output

    If we don't use the synchronized in that case it will end up in race condition.

    The section were we are using synchronized keyword is called critical condition.


    When we use Synchronization we use Locks When one thread is using the shared resource it will have the lock so
    another thread won't use. This term is called Locking

    There are two types of lock
    1. Intrinsic Lock -> automatically locks will applied
    2. Explicit Lock -> advance locking system user will tell when to lock and unlock.






 */
