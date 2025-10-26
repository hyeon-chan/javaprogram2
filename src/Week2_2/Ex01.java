package Week2_2;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int sum = 0;
		double avg = 0;
		String grade;
		
		sum = a+b+c;
		avg = (double)sum/3;
		
        if (avg >= 90) {
            grade = "A학점";
        } else if (avg >= 80) {
            grade = "B학점";
        } else if (avg >= 70) {
            grade = "C학점";
        } else if (avg >= 60) {
            grade = "D학점";
        } else {
            grade = "F학점";
        }
        System.out.println("● 총합 : " +sum);
        System.out.printf("● 평균 : %.2f\n", avg);
        System.out.println("● 학점 : " +grade);

	}

}
