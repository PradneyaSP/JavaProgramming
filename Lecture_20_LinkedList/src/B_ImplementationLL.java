public class B_ImplementationLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class MyLinkedList {
        private Node head, tail;
        public int count = 0;

        //Function to insert at End.
        void insertAtEnd(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
                tail.next = null;
            }
            count++;
        }

        //Function to insert at beginning
        void insertAtHead(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                newnode.next = null;
                tail = newnode;
            } else {
                newnode.next = head;
            }
            head = newnode;
            count++;
        }

        //Insert at a particular position
        void insertAt(int data, int pos) {
            if (pos > count || pos < 0) {
                System.out.println("Incorrect Position");
            } else if (pos == 0) {
                insertAtHead(data);
            } else if (pos == count) {
                insertAtEnd(data);
            } else {
                Node newnode = new Node(data);
                Node temp = head;
                for (int i = 1; i < pos; i++)
                    temp = temp.next;

                newnode.next = temp.next;
                temp.next = newnode;
                count++;
            }
        }

        //Function to delete a node
        void deleteAt(int pos) {
            if(pos > count || pos < 0)
                System.out.println("Invalid Position");
            if(pos == 0){
                head = head.next;
                count--;
            }
            else if( pos == count - 1){
                Node temp = head ;
                while (temp.next != tail)
                    temp = temp.next;
                temp.next = null;
                tail = temp;
                count--;
            }
            else{
                Node temp = head ;
                for(int i = 1 ; i < pos ; i++)
                    temp = temp.next;
                temp.next = temp.next.next;
                count--;
            }
        }

        //Function to get the value at a particular index
        int getElement(int pos) {
            Node temp = head;
            int i = 0;
            for (; i < pos; i++)
                temp = temp.next;

            return temp.data;
        }

        //Function to display the LinkedList
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        //Function to return the size
        int size() {
            return count;
        }
    }

    public static void main(String[] args) {
        //Creating a new linked list;
        MyLinkedList l1 = new MyLinkedList();
        //Inserting at End;
        l1.insertAtEnd(5);
        l1.insertAtEnd(4);
        l1.insertAtEnd(3);
        l1.insertAtEnd(2);
        l1.insertAtEnd(1);
        l1.display();
        System.out.println("\nSize : " + l1.size());

        //Inserting at Head;
        l1.insertAtHead(6);
        l1.insertAtHead(7);
        l1.display();
        System.out.println("\nSize : " + l1.size());

        //Inserting at a position
        l1.insertAt(0, 1);
        l1.insertAt(-1, 5);
        l1.display();
        System.out.println("\nSize : " + l1.size());

        //Checking the if statements in the function
        l1.insertAt(0, 10);
        l1.insertAt(0, 0);
        l1.insertAt(0, 10);
        l1.display();
        System.out.println("\nSize : " + l1.size());

        //Finding an element;
        System.out.println("\nThe element at index 3 is : " + l1.getElement(3));
        System.out.println("The element at index 8 is : " + l1.getElement(8));

        //Deleting a node
        System.out.println();
        l1.deleteAt(0);
        l1.deleteAt(9);
        l1.deleteAt(1);
        l1.deleteAt(4);
        l1.display();
        System.out.println("\nSize : " + l1.size());
    }
}
