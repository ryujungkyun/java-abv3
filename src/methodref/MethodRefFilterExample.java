package methodref;

import java.io.PrintStream;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class MethodRefFilterExample {

    public static void main(String[] args) {
        // 예제 1: String::isEmpty 사용
        System.out.println("=== String::isEmpty 예제 ===");
        List<String> list1 = List.of("Apple", "", "Banana", " ", "Berry");
        list1.stream()
                .filter(String::isEmpty) // 메서드 참조
                .forEach(s -> System.out.println("빈 문자열: '" + s + "'"));

        // 위 코드는 아래 람다 표현식과 동일합니다.
        // .filter(s -> s.isEmpty())

        System.out.println("\n=== Objects::nonNull 예제 ===");
        // 예제 2: Objects::nonNull 사용 (static 메서드 참조)
        List<String> list2 = List.of("Apple", null, "Banana", "Berry", null);
        list2.stream()
                .filter(Objects::nonNull) // 메서드 참조
                .forEach(System.out::println);
        PrintStream out = System.out;
        PrintStream out1 = System.out;
        System.out.println(out);
        System.out.println(out1);
        // 위 코드는 아래 람다 표현식과 동일합니다.
        // .filter(s -> Objects.nonNull(s))

        System.out.println("\n=== 커스텀 static 메서드 예제 ===");
        // 예제 3: 직접 만든 static 메서드 참조
        List<String> list3 = List.of("Apple", "Banana", "Ant", "Avocado");
        list3.stream()
                .filter(MethodRefFilterExample::isStartWithA) // 메서드 참조
                .forEach(System.out::println);
        
        // 위 코드는 아래 람다 표현식과 동일합니다.
        // .filter(s -> isStartWithA(s))
    }

    public static boolean isStartWithA(String s) {
        return s.startsWith("A");
    }
}
