package Week5_1;
import java.util.StringTokenizer;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ex = "국어/수학/영어/과학";
        StringTokenizer ex2 = new StringTokenizer(ex, "/");

        int count = ex2.countTokens();
        System.out.println("총 과목 수: " + count);

        for (int i = 0; i < count; i++) {
            String subject = ex2.nextToken();
            System.out.println((i + 1) + ". " + subject);
        }
    }
}