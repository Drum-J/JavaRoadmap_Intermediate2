package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("10"); // Integer만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // 캐스팅 없이 Integer 타입 반환
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Long> longBox = new GenericBox<Long>();
        longBox.set(100L);
        Long l = longBox.get();
        System.out.println("l = " + l);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        //new 말고 앞 부분에 타입을 적고 new 에는 생략 해도 된다
        //위의 Generic<T> 를 보면 T 부분이 회색으로 보인다!
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}