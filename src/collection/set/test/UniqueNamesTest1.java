package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(inputArr));

        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
    }
}
