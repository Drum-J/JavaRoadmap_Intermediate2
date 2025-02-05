package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> hashSet = new LinkedHashSet<>(List.of(inputArr)); //자바 9 이상이라면 List.of() 를 권장

        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
    }
}
