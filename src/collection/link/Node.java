package collection.link;

public class Node<T> {
    T item;
    Node<T> next;

    public Node(T item) {
        this.item = item;
    }

    //IDE 생성 toString()
    /*
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
    */

    // 직접 구현 toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node<T> x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);

            if (x.next != null) {
                sb.append("->");
            }

            x = x.next;
        }

        sb.append("]");

        return sb.toString();
    }
}
