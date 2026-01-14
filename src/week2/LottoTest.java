package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LottoTest {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>();

        while (lotto.size() < 6) {
            int number = (int) (Math.random() * 45) + 1;
            lotto.add(number);
        }

        ArrayList<Integer> list = new ArrayList<>(lotto);
        Collections.sort(list);

        System.out.println("이번 주 로또 추천 번호");
        System.out.println(list);
    }
}
