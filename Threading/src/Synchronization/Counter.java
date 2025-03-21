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




 */
