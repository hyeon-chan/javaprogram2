package week13_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        s1.retainAll(s2);   // 교집합 계산

        System.out.println(s1);   // 출력: [2, 4]
    }
}
