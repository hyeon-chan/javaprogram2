package week10;

public class ex06 {
	int x;
	int y;
	int temp;
	
	public ex06() {
		x=10;
		y=20;
	}
	void print() {
		System.out.printf("x=%d, y=%d\n", x, y);
	}
	
	void swap() {
		temp = x;
		x = y;
		y = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex06 k = new ex06();
		k.print();
		k.swap();
		k.print();
	}

}
