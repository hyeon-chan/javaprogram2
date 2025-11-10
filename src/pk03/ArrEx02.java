package pk03;

public class ArrEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data;
		int sum;
		double avg;
		data = new int[] {10, 50, 100, 7, 8, 25};

		sum = 0;
		for(int d:data)
			sum += d;

		avg = (double)sum/data.length;

		System.out.printf("입력한 데이터의 총합은 [%d], 평균은 [%.2f]입니다.\n",sum, avg);
	}

}
