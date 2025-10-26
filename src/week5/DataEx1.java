package week5;

public class DataEx1 {
    public static void main(String[] args) {

        String name;   
        int score1; 
        int score2;  
        double sum;
        double avg; 
        String grade;
        
        System.out.println("이름과 두 개의 점수입니다: 홍길동 100 97");
        name = "홍길동";
        score1 = 100;
        score2 = 97;
        sum = score1 + score2;
        avg = sum / 2.0; 

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("출력결과: ");
        System.out.printf("입력된 이름과 두 개의 점수는 %s, %d, %d 이고, \n", name, score1, score2);
        System.out.printf("합은 %.2f, 평균은 %.2f, 학점은 %s입니다. ", sum, avg, grade);
        
    }
}
