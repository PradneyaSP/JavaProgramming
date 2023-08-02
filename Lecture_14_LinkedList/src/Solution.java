import com.sun.source.tree.NewArrayTree;

import java.util.List;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        n = count - n + 1;
        temp = head;
        for (int i = 1; i < n; i++)
            temp = temp.next;

        return temp;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0, countB = 0;

        //Counting the number of elements in ListA and ListB
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null || tempB != null) {
            if (tempA != null) {
                countA++;
                tempA = tempA.next;
            }
            if (tempB != null) {
                countB++;
                tempB = tempB.next;
            }
        }

        tempA = headA;
        tempB = headB;
        //Shifting the bigger LinkedList ahead
        if (countA > countB) {
            for (int i = 1; i <= countA - countB; i++)
                tempA = tempA.next;
        } else {
            for (int i = 1; i <= countB - countA; i++)
                tempB = tempB.next;
        }

        //Finding the intersection
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    //Cyclic Linked List
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean isCyclic = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                isCyclic = true;
                break;
            }
        }

        if (isCyclic) {
            ListNode temp = head;
            while (slow != temp) {
                slow = slow.next;
                temp = temp.next;
            }
            return slow;
        } else
            return null;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        boolean isOdd = true;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;
        ListNode temp = head.next.next;

        while (temp != null) {
            if (isOdd) {
                odd.next = temp;
                temp = temp.next;
                odd = odd.next;
                isOdd = false;
            } else {
                even.next = temp;
                temp = temp.next;
                even = even.next;
                isOdd = true;
            }
        }

        even.next = null;
        odd.next = evenHead;

        return oddHead;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode agla = head;

        while (curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;
    }

    public ListNode recRevList(ListNode head) {
        if (head.next == null) return head;
        ListNode newnode = recRevList(head.next);
        head.next.next = head;
        head.next = null;
        return newnode;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = reverseList(slow.next);

        ListNode p1 = head;
        ListNode p2 = slow.next;

        while (p2 != null) {
            if (p1.val != p2.val)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    /*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
    //Important Doubly Linked List Question.
    public static class DNode {
        int val;
        DNode next;
        DNode prev;
        DNode child;
    }
    public DNode flatten(DNode head) {
        DNode temp = head;
        while (temp != null) {
            DNode t = temp.next;
            if (temp.child != null) {
                DNode c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while (c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if (t != null)
                    t.prev = c;
            }
            temp.child = null;
            temp = t;
        }
        return head;
    }

    public static void main(String[] args) {

    }

}
