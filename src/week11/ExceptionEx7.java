package week11;

public class ExceptionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
		try {
		data1 = args[0];
		data2 = args[1];
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		}
		finally {
			
			System.out.println("프로그램을 종료합니다. ");
		}
	}

}