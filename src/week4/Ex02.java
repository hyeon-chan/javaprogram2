package week4;

public class Ex02 {
	int temp;
	int x, y;
	Ex02() {
		x = 10;
		y = 20;
	}
	void eprint() {
		System.out.printf("x=%d, y=%d", x, y);
		System.out.println();
	}
	
	void eswap() {
		temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 k = new Ex02();
		
		k.eprint();
		k.eswap();
		k.eprint();
	}

}
