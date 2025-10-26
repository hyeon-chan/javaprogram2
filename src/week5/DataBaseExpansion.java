package week5;

abstract public class DataBaseExpansion {
	String name;   
	int score1; 
	int score2;
	
	public void hallymPrintBase() {
		System.out.println("출력결과: ");
		System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 입니다. \n", name, score1, score2);
	}
	
	abstract void hallymInput();
	abstract void hallymSum();
	abstract void hallymAvg();
	abstract void hallymGrade();
	abstract void hallymPrint();
}
