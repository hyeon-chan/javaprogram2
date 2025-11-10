package week10;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		String y;

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		x = scanner.nextInt();

		if (x >= 45 && x <= 75) {
			y = "통과";
		} else if (x >= 30 && x <= 44) {
			y = "보류";
		} else if (x >= 76 && x <= 90) {
			y = "보류";
		} else {
			y = "불발";
		}

		System.out.println(y);

	}
}
