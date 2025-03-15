package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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





    }

}
