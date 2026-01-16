package week2;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        //지네릭스를 사용 안 함
        List list1 = new ArrayList();
        list1.add("Java");
        list1.add(10);

        String s1 = (String) list1.get(0);
        System.out.println("구식: " + s1);
        //String s2 = (String) list1.get(1);

        //지네릭스를 사용
        List<String> list2 = new ArrayList<>();
        list2.add("Java");

        String s3 = list2.getFirst();
        System.out.println("신식: " + s3);
    }
}
