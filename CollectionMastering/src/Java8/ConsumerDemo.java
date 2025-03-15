package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.println(x);

        print.accept(10);

        List<Integer> list = Arrays.asList(1,3,4,5);

        Consumer<List<Integer>> list1 = x -> {
            for(int i : x){
                System.out.println(i);
            }
        };

        list1.accept(list);

    }

}

/*

Consumer is also a functional parameter . There is no return type for this, The Method present
here is accept . It will only consume as the name suggest.


 */