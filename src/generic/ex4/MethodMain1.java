package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        Integer integerValue = GenericMethod.<Integer>numberMethod(100);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // 타입 추론, 타입 인자 생략
        Long longValue = GenericMethod.numberMethod(100L);
    }
}
