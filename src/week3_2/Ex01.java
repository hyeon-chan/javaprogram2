package week3_2;

class Data{
	private String name;
	private int age;
	private double score;
	
	public Data(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getScore() {
		return score;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n = new String[] {"박달문", "송시연"};
		
		for(String d:n)
			System.out.println(d);
		
		Data std = new Data("홍길동", 20, 30.5);
		System.out.println("이름: " + std.getName() + "\n"
						 + "나이: " + std.getAge()  + "\n"
						 + "점수: " + std.getScore() );
						 
}

}
