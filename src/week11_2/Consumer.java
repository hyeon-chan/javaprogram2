package week11_2;

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = buffer.get();
            System.out.println("소비자: " + data + "번 케이크를 소비하였습니다.");
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {}
        }
    }
}
