package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        //제네릭 메서드를 사용할 경우에는 전달한 타입을 명확하게 반환한다.
        Dog dog = WildcardEx.printAndReturn(dogBox);

        catBox.set(new Cat("냐옹이", 200));
        Cat cat = WildcardEx.printAndReturn(catBox);

        // 와일드카드를 사용할 경우에는 전달한 타입을 명확하게 반환하지 않는다. Dog 를 넣었지만 Animal 반환
        // Dog 나 Cat 을 원하면 다운캐스팅을 해줘야 한다.
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}
