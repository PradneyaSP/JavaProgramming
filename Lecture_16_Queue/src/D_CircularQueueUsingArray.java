import java.util.Queue;

public class D_CircularQueueUsingArray {
    public static class CircularQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        int n = arr.length;

        void add(int val) {
            if (size == n) {
                System.out.println("Queue is full!!");
                return;
            }

            if (size == 0) {
                arr[0] = val;
                front = rear = 0;
            } else if (rear < n - 1) {
                arr[++rear] = val;
            } else if (rear == n - 1) {
                arr[0] = val;
                rear = 0;
            }

            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!!");
                return -1;
            } else {
                System.out.print("Deleted: ");
                int del = arr[front];
                if (front == n - 1)
                    front = 0;
                else front++;
                size--;
                return del;
            }
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!!");
                return -1;
            }else{
                System.out.print("Peek: ");
                return arr[front];
            }
        }

        void display(){
            if (size == 0) {
                System.out.println("Queue is Empty!!");
            }
            else {
                System.out.print("Queue : ");
                if(front <= rear){
                    for(int i = front ; i <= rear ;i++)
                        System.out.print(arr[i] + " ");
                }
                else {
                    for(int i = front ; i < n ;i++)
                        System.out.print(arr[i] + " ");
                    for(int i = 0 ; i <= rear ;i++)
                        System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();
        System.out.println( q.peek());
        q.add(6);
        q.display();
    }
}
