package week13_2;

import java.util.*;
public class SortTest {
    public static void main(String[] args) {
        Student array[] = {
            new Student(2, "김철수"),
            new Student(3, "이철수"),
            new Student(1, "박철수"),
        };

        List<Student> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(list);
    }
}
