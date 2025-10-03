package lambda.lambda5.map;

import lambda.lambda5.filter.IntegerFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringToIntegerMapper {

    public static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            // 바뀌는 부분
            numbers.add(mapper.apply(s));
        }
        return numbers;
    }
}
