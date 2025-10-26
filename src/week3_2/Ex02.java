package week3_2;

class Data2{
	private String name;
	private int age;
	private double score;
	
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setScore(double score) {this.score = score;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public double getScore() {return score;}
}

public class Ex02 extends Data2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 std = new Ex02();
		
		std.setName("박달문");
		std.setAge(30);
		std.setScore(45.5);
		
		System.out.println("이름: " + std.getName() + "\n"
						 + "나이: " + std.getAge()  + "\n"
						 + "점수: " + std.getScore() );
						 
}

}
