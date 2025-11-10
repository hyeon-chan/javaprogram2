package week10;

class Ex{
	String name;
	int age;
	
	
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
}
public class ex09 extends Ex{
	public ex09() {
		name = "나춘림";
		age = 20;
		print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex09 k = new ex09();
		
		k.setName("홍길동");
		k.setAge(25);
		k.print();
		System.out.printf("이름: %s, 나이: %d\n", k.getName(), k.getAge());
	}

}
