package Java8;

public class LambdaExpression {
    public static void main(String[] args) {

        MathOperation answer = (a,b) ->  a+b;
        int a = answer.operate(1,6);

        System.out.println(a);

    }
}

interface MathOperation{
    int operate(int a , int b);
}

/*

    Lambda Expression is like Arrow function in javaScript
    It Only works with Functional Interface, That means an interface with only one function definition
    When you are calling the function no need to mention access modifier,function name anything.

 */