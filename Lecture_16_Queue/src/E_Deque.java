import java.util.ArrayDeque;
import java.util.Deque;

public class E_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);
        deque.addFirst(0);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
