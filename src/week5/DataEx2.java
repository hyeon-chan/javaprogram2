package week5;

import java.util.Scanner;

public class DataEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name;   
		int score1; 
		int score2;  
		int sum;
		double avg; 
		String grade;

		System.out.print("이름과 두 개의 점수를 입력하세요: ");
		name = scanner.next(); 
		score1 = scanner.nextInt(); 
		score2 = scanner.nextInt(); 
		sum = score1 + score2;
		avg = (double)sum / 2.0; 
		scanner.close();

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("출력결과: ");
		System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 이고, \n", name, score1, score2);
		System.out.printf("합은 %d, 평균은 %.2f, 학점은 %s입니다. ", sum, avg, grade);

	}

}
