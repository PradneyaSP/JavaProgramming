import java.util.LinkedList;
import java.util.Queue;

public class A_Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Queue: " + q);
        System.out.println("Size:" + q.size());
        q.remove();
        System.out.println("Queue: " + q);
        System.out.println("Front: " + q.element());
        q.poll();
        System.out.println("Queue: " + q);
        System.out.println("Front: " + q.peek());
    }
}
