package Week02;
import java.util.Scanner;

class Student {
    String name;
    int point;
    Scanner scanner = new Scanner(System.in);

    void input() {
        System.out.print("이름과 점수를 입력하세요: ");
        name = scanner.next();     
        point = scanner.nextInt(); 
        scanner.close();
    }

    void print() {
        System.out.println("입력하신 데이터는 " + name + ", " + point + " 입니다.");
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Student student = new Student();

        student.input();  
        student.print();   
    }
}


