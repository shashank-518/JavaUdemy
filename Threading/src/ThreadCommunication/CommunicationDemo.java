package ThreadCommunication;


import java.util.Date;

class SharedResource{

    private int data;

    private boolean hasData;

    public synchronized void produce(int value){

        while (hasData){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        System.out.println("Produced " + data);
        hasData = true;
        notify();





    }

    public synchronized int consume(){
        while (!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        hasData = false;
        notify();
        System.out.println("Produced " + data);
        return data;

    }

}

class Producer implements Runnable{

    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i =0;i<10;i++){
            resource.produce(i);

        }
    }
}


class Consumer implements Runnable{

    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i =0;i<10;i++){
            int value = resource.consume();

        }
    }
}

public class CommunicationDemo {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread ProducerThread = new Thread(new Producer(resource));
        Thread ConsumerThread = new Thread(new Consumer(resource));


        ProducerThread.start();
        ConsumerThread.start();

    }

}
