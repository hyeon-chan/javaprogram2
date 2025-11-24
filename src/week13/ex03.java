package week13;
import java.util.*;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("전화번호 입력: ");
        String phone = sc.nextLine();

        boolean res = false;

        int len = phone.length();

        if (len == 13) {

            if (phone.charAt(3) == '-' && phone.charAt(8) == '-') {

                res = true;

                for (int i = 0; i < len; i++) {
                    if (i == 3 || i == 8) continue; 

                    if (phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                        res = false;
                        break;
                    }
                }
            }
        }

        else if (len == 12) {

            if (phone.charAt(3) == '-' && phone.charAt(7) == '-') {

                res = true;

                for (int i = 0; i < len; i++) {
                    if (i == 3 || i == 7) continue;

                    if (phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                        res = false;
                        break;
                    }
                }
            }
        }

        else if (len == 11) {

            if (phone.charAt(2) == '-' && phone.charAt(6) == '-') {

                res = true;

                for (int i = 0; i < len; i++) {
                    if (i == 2 || i == 6) continue;

                    if (phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                    	res = false;
                        break;
                    }
                }
            }
        }

        if (res)
            System.out.println("정상적인 전화번호 형식입니다.");
        else
            System.out.println("비정상적인 형식입니다.");
    }
}
