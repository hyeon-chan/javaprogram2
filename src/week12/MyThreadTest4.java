package week12;

class MyTask implements Runnable{
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println(Thread.currentThread().getName() + "=> 작업 중 ...");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}
public class MyThreadTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread worker1 = new Thread(new MyTask(), "Worker-1");
		Thread worker2 = new Thread(new MyTask(), "Worker-2");
		
		worker1.start();
		worker2.start();
	}

}
