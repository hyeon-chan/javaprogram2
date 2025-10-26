package pk03;
import java.util.Scanner;

interface InterMethod{
	void input();
	void process();
}

public class ArrEx06 extends ArrBasePrint implements InterMethod {


	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 데이터의 개수를 입력하세요: ");
		int cnt = scanner.nextInt();
		data = new int[cnt];
		System.out.printf("[%d]개의 데이터를 입력하세요: ", cnt);
		for(int i= 0; i<data.length; i++) {
			data[i] = scanner.nextInt();
		}
		scanner.close();
	}

	public void process() {
		sum = 0;
		for(int d:data)
			sum += d;

		avg = (double)sum/data.length;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrEx06 m = new ArrEx06();
		m.input();
		m.process();
		m.print();
	}
}