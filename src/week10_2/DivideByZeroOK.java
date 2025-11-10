package week10_2;

import java.util.Scanner;

public class DivideByZeroOK {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // 예외 발생
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}

