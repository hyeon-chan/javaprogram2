package week4;
import java.util.Scanner;

interface interEx04 {
    void input();
    void process();
    void print();
}

class Check implements interEx04 {
	Scanner scanner = new Scanner(System.in);
    String Eng;
    int x;    
    int y;    
    int space; 

    public void input() {
        System.out.print("영문 문자열을 입력하세요: ");
        Eng = scanner.nextLine();
    }

    public void process() {
    	x = 0;
        y = 0;     
        space = 0;  

        for (int i = 0; i < Eng.length(); i++) {
            char dt = Eng.charAt(i);

            if (dt == ' ') {
                space++;
            }
            else if (dt=='A'||dt=='a'||dt=='E'||dt=='e'||dt=='I'||dt=='i'||dt=='O'||dt=='o'||dt=='U'||dt=='u') {
                y++;
            }
        }
        x = Eng.length() - y - space;
    }

    public void print() {
        System.out.println("자음: " + x);
        System.out.println("모음: " + y);
    }
}

public class Ex04 extends Check {
    public static void main(String[] args) {
        Ex04 k = new Ex04();
        k.input();
        k.process();
        k.print();
    }
}