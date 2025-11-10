package week11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx9 {
    // 키보드로 0~100점 사이의 정수형 점수를 입력받아 해당 점수의 학점이 출력되도록 프로그램 작성
    // 예외처리 포함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("점수를 입력하세요: ");
            int score = sc.nextInt(); 

            if (score < 0 || score > 100) {
                System.out.println("점수는 0에서 100 사이의 숫자를 입력하세요.");
            }

            char grade;
            if (score >= 90) grade = 'A';
            else if (score >= 80) grade = 'B';
            else if (score >= 70) grade = 'C';
            else if (score >= 60) grade = 'D';
            else grade = 'F';

            System.out.println("학점: " + grade);

        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
        } catch (Exception e) {
            System.out.println("실행중 오류가 있습니다");
        } finally {
            sc.close();
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
