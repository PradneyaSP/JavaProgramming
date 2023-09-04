import java.util.LinkedList;
import java.util.Queue;

public class G_StackUsingQueue {
    //push efficient
    static class MyStack {

        Queue<Integer> q1 = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            q1.add(x);
        }

        public int pop() {
            for(int i = 1 ; i <= q1.size() -1 ; i++)
                q1.add(q1.remove());
            return q1.remove();
        }

        public int top() {
            for(int i = 1 ; i <= q1.size() -1 ; i++)
                q1.add(q1.remove());
            int val = 0;
            if(q1.size()!= 0)
                val = q1.peek();
            q1.add(q1.remove());
            return val;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {

    }
}
