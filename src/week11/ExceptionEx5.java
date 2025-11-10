package week11;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("java.lang.String");
			System.out.println("해당 클래스가 존재합니다.");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다. ");
		}
		catch(Exception e) {
			System.out.println("예외 처리가 발생했습니다.");
		}
		finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
