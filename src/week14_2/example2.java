package week14_2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;
import java.io.FileWriter;

public class example2 {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("./data_soc/sourcedata.txt");
        BufferedReader br = new BufferedReader(reader);
        Writer writer = new FileWriter("./data_soc/result.txt");

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

            // 결과 파일에 "원본/총합/평균" 형식으로 한 줄씩 기록
            String finaldata = String.format("%s/%.2f/%.2f%n", data, sum, avg);
            writer.write(finaldata);
        }

        br.close();
        writer.close();
    }
}
