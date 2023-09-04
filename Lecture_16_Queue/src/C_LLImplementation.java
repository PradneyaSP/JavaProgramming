public class C_LLImplementation {
    public static class Node {
        int val;
        Node next;
    }

    public static class queueLL {
        private Node front = null;
        private Node rear = null;
        private int size;

        void add(int num) {
            Node temp = new Node();
            temp.val = num;

            if (size == 0)
                front = rear = temp;
            else {
                rear.next = temp;
                rear = temp;
                rear.next = null;
            }

            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int del = front.val;
            front = front.next;
            size--;
            return del;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.val;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.remove();
        q.display();
        System.out.println("Peek: " + q.peek());
        q.add(6);
        q.display();
    }
}
