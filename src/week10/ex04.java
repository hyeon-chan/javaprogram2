package week10;

import java.util.Scanner;

interface ex04inf {
	void process();
	void print();
}

class ex04sub {
	String name;
	int x;
	int y;
	int sum;
	double avg;
	char grade;
	
	public void print() {
		System.out.printf("이름은 %s이고, 점수는 %d, %d이고, 합은 %d이고, 평균은 %.2f이고, 학점은 %s입니다.", name, x, y, sum, avg, grade);
	}
}

public class ex04 extends ex04sub implements ex04inf {

	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름과 두개의 정수형 점수를 입력하세요: ");
		name = scanner.next();
		x = scanner.nextInt();
		y = scanner.nextInt();
		scanner.close();
	}

	@Override
	public void process() {
		sum = x + y;
		avg = sum / 2;

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex04 k = new ex04();

		k.input();
		k.process();
		k.print();

	}

}
