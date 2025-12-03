package week14_2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class example1 {

    public static void main(String[] args) throws IOException {
    	Reader reader = new FileReader("./data_soc/sourcedata.txt");

        BufferedReader br = new BufferedReader(reader);
        double sum, avg;

        while (true) {
            String data = br.readLine();
            if (data == null) break;

            System.out.println("원본 데이터 : " + data);
            // 예: 홍길동/100/78.5/90/65.8

            String[] data2 = data.split("/");

            sum = 0;
            for (int i = 1; i < data2.length; i++) {
                sum += Double.parseDouble(data2[i]);
            }

            avg = sum / 4.0;

            System.out.printf("점수의 총합은 : %.2f, 평균은 %.2f 입니다.\n\n", sum, avg);
        }

        br.close();
    }
}
