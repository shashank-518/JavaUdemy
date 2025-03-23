package ThreadCommunication;


class SharedResource{

    private int data;

    private boolean hasData;

    public void produce(int data){

    }

    public int consume(){

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
            System.out.println("Produced " + i);
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
            System.out.println("Produced " + value);
        }
    }
}

public class CommunicationDemo {
}
