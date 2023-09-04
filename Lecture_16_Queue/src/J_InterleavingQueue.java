import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class J_InterleavingQueue {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < N/2){
            st.push(q.remove());
            i++;
        }
        while(st.size()!= 0)
            q.add(st.pop());

        i = 0;
        while (i < N/2){
            st.push(q.remove());
            i++;
        }

        while (st.size() > 0){
            q.add(st.pop());
            q.add(q.remove());
        }

        while (q.size() != 0)
            st.push(q.remove());

        while (st.size()!= 0)
            ans.add(st.pop());

        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(rearrangeQueue(8,q));
    }
}
