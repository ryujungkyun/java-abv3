package lambda.lambda4;

import java.util.Objects;

public class RunnableMain {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> System.out.println("Hello Runnable");
        runnable2.run();
    }
}
