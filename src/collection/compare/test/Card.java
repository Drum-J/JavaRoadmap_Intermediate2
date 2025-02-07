package collection.compare.test;

import java.util.Comparator;

public class Card implements Comparable<Card> {
    private final Shape shape; //카드 모양
    private final int value; //카드 숫자

    public Card(Shape shape, int value) {
        this.shape = shape;
        this.value = value;
    }

    public Shape getShape() {
        return shape;
    }

    public int getValue() {
        return value;
    }

    public int compare(Card o1, Card o2) {
        if (o1.value < o2.value) {
            return -1;
        } else if (o1.value > o2.value) {
            return 1;
        } else { //카드의 숫자가 같은 경우에는 카드 문양을 비교
            return Integer.compare(o1.shape.getPriority(), o2.shape.getPriority());
        }
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.value != anotherCard.value) {
            return Integer.compare(this.value, anotherCard.value);
        } else {
            return Integer.compare(this.shape.getPriority(), anotherCard.shape.getPriority());
        }
    }

    @Override
    public String toString() {
        return value + "(" + shape.getUnicode() + ")";
    }
}
