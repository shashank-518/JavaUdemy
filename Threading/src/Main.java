class Main{
    public static void main(String[] args) {


        World world1 = new World();
        //world1.start(); This is the method to call Thread by extending thread class

        Thread t1 = new Thread(world1);
        t1.start();



        for(;;){
            System.out.println("Hello");
        }
    }
}