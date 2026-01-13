package week2;

public class ExceptionTest {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() *10);

            try {
                result = number / random;
                System.out.println("나눗셈 결과: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
        System.out.println("프로그램이 정상적으로 종료되었습니다.");
    }
}

