package week3;

public class Ex03 {

	public void eSwap(int[] d) {
		int tmp;

		tmp = d[0];
		d[0] = d[1];
		d[1] = tmp;
		
		System.out.println("교체된 데이터 : x=" + d[0] + " , y=" + d[1]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 k = new Ex03();
		int[] data = new int[2];

		data[0]=10;
		data[1]=20;

		System.out.println("원본 데이터 : x=" + data[0] + " , y=" + data[1]);
		
		k.eSwap(data);
		
		System.out.println("교체된 데이터 : x=" + data[0] + " , y=" + data[1]);
	}

}
