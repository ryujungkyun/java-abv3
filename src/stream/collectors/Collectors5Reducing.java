package stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Collectors5Reducing {

    public static void main(String[] args) {
        List<String> names = List.of("a", "b", "c", "d");

        // 컬렉션의 리듀싱은 주로 다운 스트림에 활용
        // 모든 이름을 하나의 문자열로 이어 붙이기
        String joined1 = names.stream()
                .collect(Collectors.reducing(
                        (s1, s2) -> s1 + ", " + s2
                )).get();
        System.out.println("joined1 = " + joined1);

        String join2 = names.stream()
                .reduce((s1, s2) -> s1 + ", " + s2).get();
        System.out.println("join2 = " + join2);

        String join3 = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("join3 = " + join3);

        String join4 = String.join(", ", "a", "b", "c", "d");
        System.out.println("join4 = " + join4);
    }
}
