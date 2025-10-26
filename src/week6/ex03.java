package week6;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cho;
		double data[] = {90, 78.5, 100, 56.9, 70, 56.3, 80, 50.5};
		double copy[] = new double[data.length]; 

		for (int i = 0; i < data.length; i++) {
			copy[i] = data[i];
		}

		do {
			System.out.print("1) 오름차순으로 정렬하여 출력\n"
					+ "2) 내림차순으로 정렬하여 출력\n"
					+ "3) 원본 출력\n"
					+ "4) 프로그램 종료\n"
					+ "번호를 입력하세요 : ");
			cho = s.nextInt();

			switch (cho) {
			case 1:
				for(int i=0; i<data.length; i++)
				{
					for(int j=i+1; j<data.length;j++)
					{
						double temp;
						if(data[i] > data[j])
						{
							temp = data[i];
							data[i] = data[j];
							data[j] = temp;
						}
					}
				}
				for(double n:data)
					System.out.print(n + " ");
				System.out.println();
				break;
			case 2:
				for(int i=0; i<data.length; i++)
				{
					for(int j=i+1; j<data.length;j++)
					{
						double temp;
						if(data[i] < data[j])
						{
							temp = data[i];
							data[i] = data[j];
							data[j] = temp;
						}
					}
				}
				for(double n:data)
					System.out.print(n + " ");
				System.out.println();
				break;
			case 3:
				data = copy;
				for(double n:data)
					System.out.print(n + " ");
				System.out.println();
				break;
			}

		} while (cho != 4);
		System.out.println("프로그램을 종료합니다. ");

		s.close();
	}
}
