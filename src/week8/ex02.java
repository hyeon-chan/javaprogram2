package week8;
import java.util.Scanner;

interface ex02inf {
	void input();
	void progress();
	void print();
}

public class ex02 implements ex02inf{
	double x;
	String grade;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학점을 출력할 점수를 입력하세요: ");
		x = scanner.nextDouble();
		scanner.close();
	}
	public void progress() {
		if(x>=90) grade = "A";
		else if(x>=80) grade = "B";
		else if(x>=70) grade = "C";
		else if(x>=60) grade = "D";
		else grade = "F";
	}
	public void print() {
		System.out.printf("해당점수의 학점은 %s 입니다.", grade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02 x = new ex02();
		x.input();
		x.progress();
		x.print();
	}

}
