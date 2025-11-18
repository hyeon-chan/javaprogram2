package week11_2;

class Printer1 {
    synchronized void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}


class MyThread3 extends Thread {
    Printer1 prn;
    int[] myarr = {10, 20, 30, 40, 50};

    MyThread3(Printer1 prn) { this.prn = prn; }

    public void run() {
        prn.print(myarr);
    }
}

class MyThread4 extends Thread {
    Printer1 prn;
    int[] myarr = {1, 2, 3, 4, 5};

    MyThread4(Printer1 prn) { this.prn = prn; }

    public void run() {
        prn.print(myarr);
    }
}

public class TestSynchro2 {
    public static void main(String[] args) {
        Printer1 obj = new Printer1();
        MyThread3 t1 = new MyThread3(obj);
        MyThread4 t2 = new MyThread4(obj);

        t1.start();
        t2.start();
    }
}
