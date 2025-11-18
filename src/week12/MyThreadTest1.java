package week12;

class MyThread extends Thread {
	public void run() {
		System.out.println("내가 호출될거야 ...");
	}
}
public class MyThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new MyThread();
		
		t.start();
	}

}
