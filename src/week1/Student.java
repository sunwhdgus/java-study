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
    public void showInfo() {
        System.out.println("이름: " + name + ", 전공: " + major + ", 점수 : " + grade);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
