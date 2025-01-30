package collection.link;

public class Node<T> {
    T item;
    Node<T> next;

    public Node(T item) {
        this.item = item;
    }
}
