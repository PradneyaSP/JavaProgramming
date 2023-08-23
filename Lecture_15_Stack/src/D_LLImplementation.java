public class D_LLImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                head.next = null;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Underflow");
                return -1;
            } else {
                int del = head.data;
                head = head.next;
                size--;
                return del;
            }
        }

        int peek() {
            if (head == null) {
                System.out.println("Underflow");
                return -1;
            } else {
                return head.data;
            }
        }

        boolean isEmpty() {
            return head == null;
        }

        void displayHelper(Node temp) {
            if (temp == null) return;
            displayHelper(temp.next);
            System.out.print(temp.data + " ");
        }

        void display() {
            System.out.print("\nStack : ");
            displayHelper(head);
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.display();
        System.out.println("\nThe deleted element is : " + st.pop());
        st.display();
        System.out.println("\nThe topmost element is : " + st.peek());
        st.push(9);
        st.push(8);
        st.display();
    }

}
