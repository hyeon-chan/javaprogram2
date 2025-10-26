package week8;

public class ex04 {
	private String name;
	private int age;
	
	public ex04() {
		name = "나춘림";
		age = 20;
		print();
	}
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	void print() {
		System.out.printf("이름: %s, 나이: %d\n", name, age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex04 k = new ex04();
		
		k.setName("홍길동");
		k.setAge(25);
		k.print();
		System.out.printf("이름: %s, 나이: %d\n", k.getName(), k.getAge());
	}

}
