package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add(1, 2) = " + add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub(1, 2) = " + sub.apply(1, 2));

        MyFunction xxx = getOperation("xxx");
        System.out.println("xxx(1, 2) = " + xxx.apply(1, 2));
    }

    private static MyFunction getOperation(String input) {
        if (input.equals("add")) {
            return (a, b) -> a + b;
        } else if (input.equals("sub")) {
            return (a, b) -> a - b;
        } else {
            return (a, b) -> 0;
        }
    }
}
