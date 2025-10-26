package week3;

public class Ex02 {

	public void eSwap(int x, int y) {
		int temp;

		temp = x;
		x = y;
		y = temp;
		
		System.out.println("교체된 데이터 : x=" + x + " , y=" + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 k = new Ex02();
		int x, y;

		x=10;
		y=20;

		System.out.println("원본 데이터 : x=" + x + " , y=" + y);
		
		k.eSwap(x, y);
		
		System.out.println("교체된 데이터 : x=" + x + " , y=" + y);
	}

}
