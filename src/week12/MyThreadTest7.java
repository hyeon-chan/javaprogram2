package week12;

class Counter {
	private int count;
	
	public synchronized void increment() { //동기화 작업(하나씩 실행됨)
		count ++;
	}
	public int getCount() {
		return count;
	}
}
public class MyThreadTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		
		Runnable task = ()->{
			for(int i=0; i<1000; i++)
				counter.increment();
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("최종 count 값: " + counter.getCount());
	}

}
