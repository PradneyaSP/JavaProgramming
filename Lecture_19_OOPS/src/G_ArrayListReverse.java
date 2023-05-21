import java.util.ArrayList;
import java.util.Collections;

public class G_ArrayListReverse {
    public static void reverseList(ArrayList<Integer> l1){
        int left = 0 , right = l1.size()-1;
        while(left<right){
            int temp = l1.get(left);
            l1.set(left,l1.get(right));
            l1.set(right,temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);

        System.out.println("Original List : ");
        System.out.println(list);
        System.out.println("Reversed list : ");
        reverseList(list);
        System.out.println(list);
        System.out.println("Original List : ");
        Collections.reverse(list);
        System.out.println(list);

    }
}
