package week10;

public class DataBaseEx01{
	private String name;
	private int x;
	private int y;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public DataBaseEx01(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.printf("이름은 %s이고, 점수는 %d, %d입니다.", name, x, y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DataBaseEx01 k = new DataBaseEx01("홍길동", 100, 97);
		
		k.print();
		System.out.printf("이름은 %s이고, 점수는 %d, %d입니다.", k.getName(), k.getX(), k.getY());*/
		new DataBaseEx01("홍길동", 100, 97).print();
	}

}
