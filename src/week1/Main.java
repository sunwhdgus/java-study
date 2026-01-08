package week1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       System.out.println("=== 학생 관리 시스템 시작 ===");

       // Student 객체만 담을 수 있는 리스트
       List<Student> students = new ArrayList<>();

       // 리스트에 학생 개체 추가
       students.add(new Student("김철수", "컴퓨터공학", 3));
       students.add(new Student("이영희", "시각디자인", 2));
       students.add(new Student("박민수", "경영학", 4));

       for (Student s: students)
           s.introduce();
    }
}
