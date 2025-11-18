package week11_2;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        String[] messages = {"봄", "여름", "가을", "겨울"};
        for (int i = 0; i < messages.length; i++) {
            Thread.sleep(1000);
            System.out.println(messages[i]);
        }
    }
}
