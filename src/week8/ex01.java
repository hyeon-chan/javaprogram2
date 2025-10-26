package week8;
import java.util.Scanner;

class ex01ex {
	int x, sum, count;
	double avg;
	void input() {
		Scanner scanner =new Scanner(System.in);
		System.out.print("배수를 출력할 숫자를 입력하세요 : ");
		x = scanner.nextInt();
		sum = 0;
		count = 0;
	}
	void progress() {
		for(int i=1; i<=100; i++) {
			if(x*i>100) break;
			System.out.printf("%d ", x*i);
			sum += x*i;
			count ++;
		}
		avg = (double)sum/count;
	}
		
	void print() {
		System.out.printf("배수의 합은 %d이고, 평균은 %.2f입니다. ", sum, avg);
	}
}
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex01ex n = new ex01ex();
		n.input();
		n.progress();
		n.print();
	}

}
