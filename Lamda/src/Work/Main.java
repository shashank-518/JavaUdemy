package Work;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        MyInterImpl myInt = new MyInterImpl();
//
//        myInt.sayHello();

//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("My First Anonymous Class");
//            }
//        };
//
//        i.sayHello();

        MyInter i = ()->{
            System.out.println("This is my First Lambda Expression");
        };

        i.sayHello();


        MyInter i2 = ()-> System.out.println("This is also perfect Way to create Lambda expression");

    }
}