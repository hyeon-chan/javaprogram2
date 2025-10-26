package week5;

public class DataEx {
	public static void main(String[] args) {
		Data k1 = new Data("홍길동", 100, 78);
		System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 입니다. \n", k1.getName(), k1.getScore1(), k1.getScore2());
		
	    Data k2 = new Data();
	    System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 입니다. \n", k2.getName(), k2.getScore1(), k2.getScore2());
	    
	    k2.setNums(45, 10);
	    System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 입니다. \n", k2.getName(), k2.getScore1(), k2.getScore2());
	    
	    Data k3 = new Data("박두재");
	    System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 입니다. \n", k3.getName(), k3.getScore1(), k3.getScore2());
	    
	    Data k4 = new Data("박두재", 50);
	    System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 입니다. \n", k4.getName(), k4.getScore1(), k4.getScore2());
		
	}
}
