package week5;

public class DataBase {
	String name;   
	int score1; 
	int score2;
	
	public void hallymPrintBase() {
		System.out.println("출력결과: ");
		System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 이고, \n", name, score1, score2);
	}
}
