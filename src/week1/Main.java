package week1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("자바 복습 시작");

        int age = 20;
        if (age >= 20) {
            System.out.println("성인입니다.");
        }

        System.out.print("좋아하는 숫자를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(num);

        /*
        String[] programmingLanguage1 = {"Python","C","Java","HTML","CSS","Javascript"};
        for (String language: programmingLanguage1)
            System.out.println(language);
        //for each 구문은 기억이 잘 안 났음
        */

        ArrayList<String> programmingLanguage2 = new ArrayList<>();

        programmingLanguage2.add("Python");
        programmingLanguage2.add("C");
        programmingLanguage2.add("Java");
        programmingLanguage2.add("HTML");
        programmingLanguage2.add("CSS");
        programmingLanguage2.add("Javascript");

        for (String language: programmingLanguage2)
            System.out.println(language);

        scanner.close();
    }
}
