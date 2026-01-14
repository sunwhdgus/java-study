package week2;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("user01", "1234");
        map.put("user02", "5678");
        map.put("admin", "0000");

        System.out.println("admin의 비밀번호: " + map.get("admin"));

        if (map.containsKey("user02")) {
            System.out.println("user02 회원이 존재합니다.");
        }

        map.remove("user02");
        System.out.println("user02 삭제 후 남은 개수: " + map.size());
    }
}
