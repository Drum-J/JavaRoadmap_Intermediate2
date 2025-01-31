package collection.list.test.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ListEx2 {
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

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < numbers.size(); i++) {
                sb.append(numbers.get(i));

                if (i < numbers.size() - 1) {
                    sb.append(", ");
                }
            }

            writer.write(sb.toString());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
