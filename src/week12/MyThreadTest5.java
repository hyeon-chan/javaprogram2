package week12;

class MyThread5 implements Runnable {

    String name;

    public MyThread5(String name) {  
        this.name = name;
    }

    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(name + i + ":");
        }
    }
}

public class MyThreadTest5 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread5("H"));
        Thread t2 = new Thread(new MyThread5("S"));

        t1.start();
        t2.start();
    }
}
