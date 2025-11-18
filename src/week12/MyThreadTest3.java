package week12;

class MyThread3 implements Runnable { //extends Thread
	public void run() {
		System.out.print("Runnable 인터페이스를 이용한 쓰레드 상황 -> ");
		for(int i=1; i<=10; i++) {
			System.out.print(i + "...");
		}
	}
}
public class MyThreadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyThread3());
		
		t.start();
		System.out.println("난 main()에서 출력된거야 ~");
	}

}
