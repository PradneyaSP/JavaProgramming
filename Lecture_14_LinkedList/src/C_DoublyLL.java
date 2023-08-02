import java.util.Scanner;

public class C_DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void reverseDisplay(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static class DoublyLinkedList {
        private Node head = null, tail = null;

        DoublyLinkedList() {
            int choice = 1;
            while (choice == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value : ");
                int data = sc.nextInt();
                Node newNode = new Node(data);

                if (head == null) {
                    head = tail = newNode;
                    head.prev = null;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = tail.next;
                }

                System.out.println("Enter 1 to continue 0 to exit");
                choice = sc.nextInt();
            }

            tail.next = null;

            display(head);
            reverseDisplay(tail);
        }


    }

    public static void main(String[] args) {
        DoublyLinkedList l1 = new DoublyLinkedList();
    }
}
