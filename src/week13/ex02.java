package week13;
import java.util.*;

public class ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = scanner.nextLine();

        System.out.print("주민번호 입력: ");
        String number = scanner.nextLine();

        char y1 = number.charAt(0);
        char y2 = number.charAt(1);
        char m1 = number.charAt(2);
        char m2 = number.charAt(3);
        char d1 = number.charAt(4);
        char d2 = number.charAt(5);

        String birth = "" + y1 + y2 + m1 + m2 + d1 + d2;

        int yy = (y1 - '0') * 10 + (y2 - '0'); 
        char genderCode = number.charAt(7);

        int year;
        if (genderCode == '1' || genderCode == '2') {
            year = 1900 + yy;
        } else {
            year = 2000 + yy;
        }

        String gender;
        if (genderCode == '1' || genderCode == '3')
            gender = "남자";
        else if (genderCode == '2' || genderCode == '4')
            gender = "여자";
        else 
        	gender = "오류 ";

        boolean MZ = (year >= 1980 && year <= 2012);

        System.out.println("이름: " + name);
        System.out.println("생년월일: " + birth);
        System.out.println("출생년도: " + year);
        System.out.println("성별: " + gender);
        System.out.println("MZ세대: " + (MZ ? "맞음" : "아님"));
    }
}
