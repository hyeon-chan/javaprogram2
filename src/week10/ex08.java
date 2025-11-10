package week10;
import java.util.Scanner;
public class ex08 {
	double [] data;
	double sum;
	double avg;
	String grade;
	
	public ex08() {
		data = new double[100];
	}
	public void input() {
	Scanner scanner = new Scanner(System.in);
	for(int i=0; i<data.length; i++) {
		System.out.printf("%d번째 숫자 입력: ", i+1);
		data[i] = scanner.nextDouble();
		sum += data[i];
	}
	}
	public void process() {
	
	avg = sum/data.length;
	
	if(avg >= 90)
		grade = "A";
	else if(avg >= 80)
		grade = "B";
	else if(avg >= 70)
		grade = "C";
	else if(avg >= 60)
		grade = "D";
	else 
		grade = "F";
	}
	
	public void print() {
		System.out.printf("평균은 %.2f이고, 학점은 %s 입니다. ", avg, grade);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex08 k = new ex08();
		k.input();
		k.process();
		k.print();
	}

}
