package week3;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, temp;
		
		x=10;
		y=20;
		
		System.out.println("원본 데이터 : x=" + x + " , y=" + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("교체된 데이터 : x=" + x + " , y=" + y);
	}

}
