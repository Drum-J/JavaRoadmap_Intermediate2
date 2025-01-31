package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 2195ms
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 3ms

        System.out.println("== ArrayList 사용 결과 ==");
        BatchProcessor processor = new BatchProcessor(arrayList); // 런타임 시 생성자 의존관계 주입
        processor.logic(50_000);

        System.out.println("== LinkedList 사용 결과 ==");
        processor = new BatchProcessor(linkedList); // 런타임 시 생성자 의존관계 주입
        processor.logic(50_000);
    }
}
