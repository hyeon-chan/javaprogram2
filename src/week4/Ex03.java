package week4;
import java.util.Scanner;

interface Ex03Inter {
	void input();
	void process();
	void print();
}
class Score implements Ex03Inter{
    Scanner scanner = new Scanner(System.in);
    double sum;
    double avg;
    String grade;
    double data[];

    public void input() {
    	System.out.println("5개의 실수형 데이터를 입력하세요: ");
        data = new double[5];
        for(int i=0; i<data.length; i++)
        	data[i] = scanner.nextDouble();
        
        scanner.close();
    }

    public void process() {
        sum = 0.0;
        for(int i=0; i<data.length; i++)
        	sum += data[i];
        avg = sum/data.length;

        if (avg >= 90) grade = "A";
        else if (avg >= 80) grade = "B";
        else if (avg >= 70) grade = "C";
        else if (avg >= 60) grade = "D";
        else grade = "F";
    }

    public void print() {
        System.out.printf("총합: %.1f, 학점: %s", sum, grade);
    }
    
}

public class Ex03 {
    public static void main(String[] args) {
        Score s = new Score();
        s.input();
        s.process();
        s.print();
    }
}

