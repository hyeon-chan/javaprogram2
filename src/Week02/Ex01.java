package Week02;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 점수를 입력하세요 : ");
		String name = scanner.next();
		int point = scanner.nextInt();
		
		System.out.println("입력하신 데이터는 " + name + ", " + point + "입니다. ");
		scanner.close();
	}

}
