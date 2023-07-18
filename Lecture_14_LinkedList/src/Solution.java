import com.sun.source.tree.NewArrayTree;

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

    public static int signFunc(int n) {
        return Integer.compare(n, 0);
    }

    public int arraySign(int[] nums) {
        int product = 1;
        for (int i = 0; i < nums.length; i++)
            product *= nums[i];

        return signFunc(product);
    }

    public static void main(String[] args) {
        System.out.println(signFunc(8987870));
    }

}
