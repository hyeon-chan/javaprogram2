package pk03;
import java.util.Scanner;
public class ArrEx03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] data;
		int sum;
		double avg;
		System.out.print("입력할 데이터의 개수를 입력하세요: ");
		int cnt = scanner.nextInt();
		data = new int[cnt];

		System.out.printf("[%d]개의 데이터를 입력하세요: ", cnt);
		for(int i= 0; i<data.length; i++) {
			data[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("----------------------------------------------------");
		System.out.print("입력한 데이터: ");
        for (int d : data) {
            System.out.print("{" + d + "} ");
        }
		sum = 0;
		for(int d:data)
			sum += d;

		avg = (double)sum/data.length;

		System.out.printf("\n입력한 데이터의 총합은 [%d], 평균은 [%.2f]입니다.\n",sum, avg);
		System.out.println("----------------------------------------------------");
	}

}
