package collection.map.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class DictionaryTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            HashMap<String, String> dictionary = new HashMap<>();

            writer.write("== 단어 입력 단계 ==\n");
            writer.flush();
            while (true) {
                writer.write("영어 단어를 입력하세요 (종료는 'q'): ");
                writer.flush();

                String english = reader.readLine();
                if (english.equals("q")) break;

                writer.write("한글 뜻을 입력하세요: ");
                writer.flush();

                String korean = reader.readLine();
                dictionary.put(english, korean);
            }

            writer.write("\n== 단어 검색 단계 ==\n");
            writer.flush();

            while (true) {
                writer.write("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
                writer.flush();

                String find = reader.readLine();
                if (find.equals("q")) break;

                if (dictionary.containsKey(find)) {
                    writer.write(find + "의 뜻: " + dictionary.get(find));
                    writer.write("\n");
                } else {
                    writer.write(find+"은(는) 사전에 없는 단어입니다.");
                    writer.write("\n");
                }
                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
