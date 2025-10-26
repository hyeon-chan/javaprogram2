package week6;
import java.util.Scanner;
interface ex01inf {
	void input();
	void process();
	void print();
}

public class ex01 implements ex01inf{
	int x;
	String y;
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		x = scanner.nextInt();
	}
	
	public void process() {
		if (x>=45 && x<=75) {
			y = "통과";
		}else if (x>=30 && x<=44) {
			y = "보류";
		}else if (x>=76 && x<=90) {
			y = "보류";
		}else {
			y = "불발";
		}
	}
	
	public void print() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex01 k = new ex01();
		k.input();
		k.process();
		k.print();
	}
}


