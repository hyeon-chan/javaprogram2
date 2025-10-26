package week5;
import java.util.Scanner;
//추상클래스가 적용된 객체지향프로그래밍 구조 설계 & 구현 
public class DataEx5 extends DataBaseExpansion {
	Scanner scanner = new Scanner(System.in);
	  
	double sum;
	double avg; 
	String grade; 

	@Override
	public void hallymInput() {
		System.out.print("이름과 두 개의 점수를 입력하세요: ");
		name = scanner.next(); 
		score1 = scanner.nextInt(); 
		score2 = scanner.nextInt(); 
		scanner.close();
	}
	@Override
	public void hallymSum() {
		sum = score1 + score2;
	}
	@Override
	public void hallymAvg() {
		avg = sum / 2.0; 
	}
	@Override
	public void hallymGrade() {
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
	}
	@Override
	public void hallymPrint() {
		System.out.printf("합은 %.2f, 평균은 %.2f, 학점은 %s입니다. ", sum, avg, grade);
	}
	public static void main(String[] args) {
		DataEx5 k = new DataEx5();
		k.hallymInput();
		k.hallymSum();
		k.hallymAvg();
		k.hallymGrade();
		k.hallymPrintBase();
		k.hallymPrint();
	}
}