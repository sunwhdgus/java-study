package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyFilter<T> {
    boolean test(T t);
}

public class UniversalFilter {
    public static <T> List<T> filter(List<T> list, MyFilter<T> filter) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            if (filter.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("Java", "Spring", "Lambda", "API", "Hello");

        List<Integer> evenNumbers = filter(numbers, (n) -> n % 2 == 0);
        System.out.println("짝수: " + evenNumbers);

        List<String> longWords = filter(words, (s) -> s.length() >= 5);
        System.out.println("긴 단어: " + longWords);
    }
}
