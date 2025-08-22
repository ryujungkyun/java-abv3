package lambda.start;
import lambda.Procedure;

import java.util.Random;

public class Ex1RefMain {

    public static void hello(Procedure procedure) {
        //변하지 않는 부분
        long startNs = System.nanoTime();

        //코드 조각 시작
        procedure.run();
        //코드 조각 종료

        //변하지 않는 부분
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    static class Dice implements Procedure {

        @Override
        public void run() {
            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
            //코드 조각 종료
        }
    }

    static class Sum implements Procedure {

        @Override
        public void run() {
            //코드 조각 시작
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
            //코드 조각 종료
        }
    }

    public static void main(String[] args) {
        Procedure dice = new Dice();
        Procedure sum = new Sum();

        hello(dice);
        hello(sum);
    }
}