package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true){
            System.out.println("\n=== 학생 관리 시스템 v.2.0 ===");
            System.out.println("1. 학생 추가");
            System.out.println("2. 전체 리스트 조회");
            System.out.println("3. 학생 검색 (이름으로)");
            System.out.println("4. 점수 수정");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                    String name = scanner.next();
                    System.out.print("전공: ");
                    String major = scanner.next();
                    System.out.print("점수: ");
                    int grade = scanner.nextInt();

                    students.add(new Student(name, major, grade));
                    System.out.println(" 등록 완료!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("등록된 학생이 없습니다.");
                    }
                    else {
                        for (Student s: students) {
                            s.showInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("찾을 이름 입력: ");
                    String searchName = scanner.next();
                    boolean found = false;

                    for (Student s : students){
                        if (s.getName().equals(searchName)) {
                            s.showInfo();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("해당 학생이 없습니다.");
                    }
                    break;

                case 4:
                    System.out.print("점수를 수정할 학생 이름: ");
                    String editName = scanner.next();
                    boolean foundEdit = false;

                    for (Student s : students) {
                        if (s.getName().equals(editName)) {
                            System.out.print("새로운 점수 입력: ");
                            int newGrade = scanner.nextInt();

                            s.setGrade(newGrade);
                            System.out.println("수정이 완료되었습니다!");

                            foundEdit = true;
                            break;
                        }
                    }
                    if (!foundEdit) {
                        System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
