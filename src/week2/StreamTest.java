package week2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Apricot", "Blueberry");

        System.out.println("=== 1. 스트림 실습 (A로 시작하는 과일 대문자로) ===");
        // 파이프 라인
        fruits.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(s -> System.out.println(s));

        System.out.println("\n=== 2. 결과 따로 모으기 (collect) ===");
        List<String> bFruits = fruits.stream()
                .filter(s -> s.startsWith("B"))
                .collect(Collectors.toList());

        System.out.println("B팀 과일들: " + bFruits);
    }
}
