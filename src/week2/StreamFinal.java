package week2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class StreamFinal {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("홍길동", 30),
                new User("김철수", 15),
                new User("이영희", 25),
                new User("박민수", 10),
                new User("최자바", 40)
        );

        System.out.println("=== 미성년자는 제외! (성인 이름만 추출) ===");

        List<String> adultNames = users.stream()
                .filter(u -> u.getAge() >= 20)
                .map(u -> u.getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("성인 회원 명단: " +  adultNames);
    }
}
