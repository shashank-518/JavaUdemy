package Java8;

import java.util.function.*;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> s = () -> 100;

        System.out.println(s.get());


        Predicate<Integer> isEven = x -> x %2 == 0;
        Function<Integer , Integer> DoubleIt = x -> x * 2;
        Consumer<Integer> print = x -> System.out.println(x);
        Supplier<Integer> num = () -> 100;

        if(isEven.test(num.get())){
            print.accept(DoubleIt.apply(num.get()));
        }


        //BiPredicate -> it take two parameters and checks for test condition
        BiPredicate<Integer,Integer> sumeven = (x,y)-> (x+y) % 2 ==0;
        System.out.println(sumeven.test(5,5));

        //BiFunction --> it also takes two parameters and only one return type
        BiFunction<String , String , Integer> len = (a,b) -> a.length() + b.length();

        System.out.println(len.apply("abc" , "bca"));

        //Bi consumer takes two parameters
        BiConsumer<Integer , String> bi = (a,b)-> System.out.println("I am " + b + " from Bangalore. I am " + a + " years old" );

        bi.accept(20 , "Shashank");

        //UnaryOperator is also a Function difference is instead of writing same return type and type.
        UnaryOperator<Integer> add = (a)-> a * 2;
        System.out.println(add.apply(100));


        //BinaryOperator is also a BiFunction instead of writing same thing multiple time we use this
        BinaryOperator<Integer> addnum = (a,b) -> a+b;

        System.out.println(addnum.apply(10,70));







    }

}
