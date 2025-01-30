package collection.link;

public class MyLinkedListV2<T> {
    private Node<T> first;
    private int size = 0;

    public void add(T e) {
        Node<T> newNode = new Node<>(e);

        if (first == null) {
            first = newNode;
        } else {
            Node<T> lastNode = getLastNode();
            lastNode.next = newNode;
        }

        size++;
    }

    //추가 코드
    public void add(int index, T t) {
        Node<T> newNode = new Node<T>(t);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<T> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }

        size++;
    }

    //추가 코드
    public T remove(int index) {
        Node<T> removeNode = getNode(index);
        T removeItem = removeNode.item;

        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<T> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;

        size--;
        return removeItem;
    }

    private Node<T> getLastNode() {
        Node<T> x = first;

        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    public T set(int index, T element) {
        Node<T> x = getNode(index);
        T oldValue = x.item;

        x.item = element;

        return oldValue;
    }

    public T get(int index) {
        Node<T> node = getNode(index);
        return node.item;
    }

    private Node<T> getNode(int index) {
        Node<T> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    public int indexOf(T t) {
        int index = 0;
        for (Node<T> x = first; x != null; x = x.next) {
            if (t.equals(x.item)) {
                return index;
            }

            index++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
