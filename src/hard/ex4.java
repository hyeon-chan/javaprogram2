package hard;
import java.util.Random;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ex = new Random();

        System.out.print("랜덤 정수 3개: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(ex.nextInt(10) + " ");  
        }

        System.out.println("\n랜덤 실수: " + ex.nextDouble());
        System.out.println("랜덤 불린: " + ex.nextBoolean());
	}

}
