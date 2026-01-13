package week2;

class Person {
    long id;

    public Person(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person p) {
            return this.id == p.id;
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1 == p2) {
            System.out.println("p1과 p2는 같은 사람입니다 (==)");
        }
        else {
            System.out.println("p1과 p2는 다른 사람입니다 (==)");
        }

        if (p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다 (equals)");
        }
        else {
            System.out.println("p1과 p2는 다른 사람입니다 (equals)");
        }
    }
}
