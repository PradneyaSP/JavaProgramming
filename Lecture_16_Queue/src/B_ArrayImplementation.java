public class B_ArrayImplementation {
    public static class queue {
        private int front = -1;
        private int rear = -1;
        int size = 0;
        private final int[] arr = new int[10];

        public void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            arr[++rear] = val;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                front++;
                size--;
                return arr[front - 1];
            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println("Deleted Element : " + q.remove());
        q.display();
        q.add(10);
        System.out.println("Peek Element : " + q.peek());
    }
}
