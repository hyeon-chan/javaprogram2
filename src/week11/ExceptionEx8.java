package week11;

public class ExceptionEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
			System.out.println("해당클래스가 존재합니다.");
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	public static void findClass() throws ClassNotFoundException {
		Class c = Class.forName("java.lang.Sting2");
	}

}
