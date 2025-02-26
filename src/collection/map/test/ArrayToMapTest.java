package collection.map.test;

import java.util.HashMap;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java","10000"},{"Spring","20000"},{"JPA","30000"}};

        // 주어진 배열로부터 Map 생성
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] s : productArr) {
            map.put(s[0], Integer.valueOf(s[1]));
        }

        // Map의 모든 데이터 출력
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println("제품: " + key + ", 가격: " +value);
        }
    }
}
