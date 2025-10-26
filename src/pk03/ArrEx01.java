package pk03;

public class ArrEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10, 50, 100, 7, 8, 25};
		int cnt;
		
		cnt = 0;
		for(int d:data)
			System.out.printf("[%d] : %4d\n", cnt++, d);
	}

}
