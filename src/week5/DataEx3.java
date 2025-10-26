package week5;
import java.util.Scanner;
//인터페이스가 적용된 객체적 프로그램 구조 설계 & 구현 
public class DataEx3 implements DataExInter {
	Scanner scanner = new Scanner(System.in);
	private String name;   
	private int score1; 
	private int score2;  
	int sum;
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
		avg = (double)sum / 2.0; 
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
		System.out.println("출력결과: ");
		System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 이고, \n", name, score1, score2);
		System.out.printf("합은 %d, 평균은 %.2f, 학점은 %s입니다. ", sum, avg, grade);
	}
	public static void main(String[] args) {
		DataEx3 k = new DataEx3();
		k.hallymInput();
		k.hallymSum();
		k.hallymAvg();
		k.hallymGrade();
		k.hallymPrint();
	}
}