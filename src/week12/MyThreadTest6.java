package week12;

class NumberThread extends Thread{ //1~5 출력문(0.5초 간격으로 출력)
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Number:" + i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class LetterThread extends Thread{ //A~E 출력문 0.5초 간격으로 출력)
	public void run() {
		for(char ch='A'; ch<='E'; ch++) {
			
			System.out.println("Letter:" + ch);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MyThreadTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread nt = new NumberThread();
		Thread lt = new LetterThread();
		
		nt.start();
		lt.start();
		
		try {
			nt.join();
			lt.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
