package week13_2;

public class MyArrayAlgTest {

    public static void main(String[] args) {
        String[] language = { "C++", "C#", "JAVA" };
        String last = MyArrayAlg.getLast(language);  // last는 "JAVA"
        System.out.println(last);
    }
}
