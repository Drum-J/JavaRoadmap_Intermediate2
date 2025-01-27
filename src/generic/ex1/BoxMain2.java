package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달 시
        integerBox.set("100"); //문자열 100 입력
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 발생!
        System.out.println("result = " + result);
    }
}
