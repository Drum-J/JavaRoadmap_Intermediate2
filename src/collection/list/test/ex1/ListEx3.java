package collection.list.test.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ListEx3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            ArrayList<Integer> numbers = new ArrayList<>();

            writer.write("n개의 정수를 입력하세요 (종료:0)\n");
            writer.flush();

            while (true) {
                int n = Integer.parseInt(reader.readLine());

                if (n == 0) {
                    break;
                }

                numbers.add(n);
            }

            int total = 0;
            for (Integer number : numbers) {
                total += number;
            }

            writer.write("입력한 정수의 합계: " + total + "\n");
            writer.write("입력한 정수의 평균: " + (double) (total / numbers.size()));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
