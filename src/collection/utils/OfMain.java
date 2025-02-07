package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        //list.add(4); // 불변 List 이기 때문에 add 불가
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list class = " + list.getClass()); //ImmutableCollections
        System.out.println("set class = " + set.getClass());
        System.out.println("map class = " + map.getClass());
    }
}
