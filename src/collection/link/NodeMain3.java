package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node<String> first = new Node<>("A");
        first.next = new Node<>("B");
        first.next.next = new Node<>("C");

        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node<String> lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index의 노드 조회
        int index = 2;
        Node<String> index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
    }

    private static <T> void printAll(Node<T> node) {
        Node<T> x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static <T> Node<T> getLastNode(Node<T> node) {
        Node<T> x = node;

        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    private static <T> Node<T> getNode(Node<T> node, int index) {
        Node<T> x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    private static <T> void add(Node<T> node, T param) {
        Node<T> lastNode = getLastNode(node);

        lastNode.next = new Node<T>(param);
    }
}
