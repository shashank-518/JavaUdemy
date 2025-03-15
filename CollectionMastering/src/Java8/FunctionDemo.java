package Java8;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer , Integer> DoubleIt = x -> 2*x;
        Function<Integer , Integer> TripleIt = x -> 3*x;

        System.out.println(DoubleIt.apply(100));
        System.out.println(DoubleIt.andThen(TripleIt).apply(20));

    }

}


/*

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

T: The type of the input to the function.
R: The type of the result of the function.

 */
