import java.util.Scanner;

public class D_CircularLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class CircularLL {
        private Node head = null, tail = null;

        CircularLL() {
            int choice = 1;
            while (choice == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value : ");
                int data = sc.nextInt();
                Node newNode = new Node(data);

                if (head == null) {
                    head = tail = newNode;
                    head.next = head;
                } else {
                    tail.next = newNode;
                    newNode.next = head;
                    tail = tail.next;
                }

                System.out.println("Enter 1 to continue 0 to exit");
                choice = sc.nextInt();
            }

            display(head);
        }

        void display (Node head) {
            Node temp = head;
            System.out.print("Data : ");
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp != head);
        }
    }

    public static void main(String[] args) {
        CircularLL l1 = new CircularLL();
    }
}
