package collection.array;

public class MyArrayListMainV2 {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);
        
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);

        //범위 초과 grow() 메서드 실행
        list.add("c");
        System.out.println(list);
        list.add("d");

        //범위 초과 grow() 메서드 실행
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
