public class A_BasicsLL {
    //Display the function Recursively
    public static void display(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    //Display the reverse LL
    public static void displayReverse(Node head) {
        if (head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }

    //Finding the length of LinkedList
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    //Node Class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        //Assigning the values.
        Node a = new Node(53);
        Node b = new Node(94);
        Node c = new Node(13);
        Node d = new Node(24);
        Node e = new Node(11);

        //Linking the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //Displaying the LinkedList
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        //Displaying recursively
        display(a);

        System.out.println();
        //Displaying reverse
        displayReverse(a);

        //Length of Linked List
        int len = length(a);
        System.out.println("\nLength : " + len);
    }
}
