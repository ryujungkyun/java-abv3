package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple1 {

    public static void main(String[] args) {
        // 기본
        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };

        System.out.println("function1: " + function1.apply(1,2));
    }


}
