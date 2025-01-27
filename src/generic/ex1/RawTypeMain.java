package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {

        //GenericBox integerBox = new GenericBox();
        GenericBox<Object> integerBox = new GenericBox<>(); // 이 코드와 똑같지만 이 방식을 권장한다.
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);
    }
}
