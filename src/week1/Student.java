package week1;

public class Student {
    // 1. 필드: 학생의 정보
    private String name;
    private String major;
    private int grade;

    // 2. 생성자
    public Student(String name, String major, int grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    // 3. 메서드
    public void introduce() {
        System.out.println("안녕하세요! 저는 " + major + " 전공, " + name + "입니다.");
    }
}
