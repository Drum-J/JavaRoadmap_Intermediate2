package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Deque<String> printQueue = new ArrayDeque<>();

        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");

        for (String string : printQueue) {
            System.out.println("출력: " + string);
        }
    }
}
