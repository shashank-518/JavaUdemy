package Java8;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x %2 == 0;

        System.out.println(isEven.test(4));


        Predicate<String> StartingWithS = x -> x.toLowerCase().startsWith("s");
        Predicate<String> EndingWithK = x -> x.toLowerCase().endsWith("k");
        Predicate<String> and = StartingWithS.and(EndingWithK);

        System.out.println(and.test("Shashank")); //true
        System.out.println(and.test("Shreyas")); //false

    }

}

/*


Predicate is a functional interface that is part of the java.util.function package.
It represents a single argument function that returns a boolean value.
In simpler terms,
it’s used to evaluate a condition on a given argument and returns either true or false


It is a part of functional parameter, Where condition value is stored in variable

 */
