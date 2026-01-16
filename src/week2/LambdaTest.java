package week2;

@FunctionalInterface
interface MyFunction {
    int max(int a, int b);
}

public class LambdaTest {
    public static void main(String[] args) {
        // 1. 익명 내부 클래스
        MyFunction f1 = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        System.out.println("익명 클래스 켤과: " + f1.max(3,5));

        // 2. 람다식
        MyFunction f2 = (a, b) -> a > b ? a : b;
        System.out.println("람다식 결과: " + f2.max(3,5));
    }
}
