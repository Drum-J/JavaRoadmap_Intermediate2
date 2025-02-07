package collection.compare.test;

public enum Shape {
    SPACE(0,"♠"),
    HEART(1,"♥"),
    DIAMOND(2,"♦"),
    CLOVER(3, "♣");

    private final int priority;
    private final String unicode;

    Shape(int priority, String unicode) {
        this.priority = priority;
        this.unicode = unicode;
    }

    public int getPriority() {
        return priority;
    }

    public String getUnicode() {
        return unicode;
    }
}
