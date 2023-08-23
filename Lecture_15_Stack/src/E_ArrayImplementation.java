public class E_ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        private int top = -1;

        void push(int data) {
            if (top == 4)
                System.out.println("Overflow..Stack is full");
            else
                arr[++top] = data;
        }

        int pop() {
            if (top == -1) {
                System.out.println("Underflow..Stack is empty");
                return Integer.MIN_VALUE;
            } else {
                int del = arr[top];
                top--;
                return del;
            }
        }

        int peek() {
            if (top == -1) {
                System.out.println("Underflow..Stack is empty");
                return Integer.MIN_VALUE;
            } else {
                return arr[top];
            }
        }

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == 4;
        }

        void display() {
            if (top == -1) {
                System.out.println("Underflow..Stack is empty");
            }
            int temp = 0;
            System.out.print("Stack : ");
            while (temp <= top)
                System.out.print(arr[temp++] + " ");
            System.out.println();
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
        System.out.println("The deleted element is : " + st.pop());
        st.display();
        System.out.println("The topmost element is : " + st.peek());
    }
}
