package week2;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("홍길동");
        names.add("김철수");
        names.add("이영희");

        System.out.println("첫 번째 사람: " + names.getFirst());
        System.out.println("총 인원 수: " + names.size() + "명");

        names.remove("김철수");
        System.out.println("삭제 후 인원 수: " + names.size() + "명");

        System.out.println("--- 남은 사람들 ---");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
