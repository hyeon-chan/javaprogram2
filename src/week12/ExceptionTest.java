package week12;

class MyException extends Exception { //Exception extends 필수
	public MyException() {
		super("내가 만든 사용자 정의 예외 클래스"); //상위 클래스의 메소드 
	}
}
public class ExceptionTest {
	
	public void myMethod() throws MyException {
		throw new MyException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest k = new ExceptionTest();
		
		try {
			k.myMethod();
		}
		catch(MyException e) {
			System.err.println(e.getMessage() + ":::");
			System.out.println("호출스택내용 : ");
			e.printStackTrace();
		}
	}

} 