package lambda.ex1;

import lambda.Procedure;
import java.util.Arrays;

public class M3MeasureTime {



    // 공통: 실행 시간 측정 메서드
    private static void measure(Procedure procedure) {
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");

    }

    public static void main(String[] args) {

        //1. 익명 클래스로 1부터 N까지 합 구하기
        measure(new Procedure() {
            @Override
            public void run() {
                int N = 100;
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                System.out.println("[1부터 " + N + "까지 합] 결과: " + sum);
            }
        });

        //2. 익명 클래스로 배열 정렬
        measure(new Procedure() {
            @Override
            public void run() {
                int[] arr = {4, 3, 2, 1};
                System.out.println("원본 배열:" + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            }
        });
    }
}
