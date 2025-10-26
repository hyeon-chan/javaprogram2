package Week2_2;

import java.util.Scanner;

public class Ex02 {
	
	int sum;
	double avg;
	String grade;
	int a, b, c;
	Scanner scanner = new Scanner(System.in);
	
	void input() {
	System.out.println("세 개의 정수를 입력하세요: ");
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	}
	
	void process() {
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
	}
    void print() {
    System.out.println("● 총합 : " +sum);
    System.out.printf("● 평균 : %.2f\n", avg);
    System.out.println("● 학점 : " +grade);
    }

	public static void main(String[] args) {
		Ex02 k = new Ex02();
		
		k.input();
		k.process();
		k.print();
	}
}