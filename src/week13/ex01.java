package week13;

import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int computer = rand.nextInt(10) + 1; 
        int attempts = 0; 

        while (attempts < 5) {
            System.out.print("숫자를 입력하세요 (1~10): ");
            int user = sc.nextInt();
            attempts++;

            if (user < 1 || user > 10) {
                System.out.println("범위를 벗어났습니다! (남은 기회: " + (5 - attempts) + ")");
                continue;
            }

            if (user == computer) {
                System.out.println("정답입니다");
                System.out.println("컴퓨터 숫자: " + computer);
                break;
            } else {
                System.out.println("틀렸습니다 (남은 기회: " + (5 - attempts) + ")");
            }
        }

        if (attempts >= 5) {
            System.out.println("\n기회를 모두 사용했습니다. 게임 종료!");
            System.out.println("정답은 " + computer + " 이었습니다!");
        }

        sc.close();
    }
}