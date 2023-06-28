import java.util.Collections;
import java.util.ArrayList;

public class H_ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(79);
        l1.add(96);
        l1.add(12);
        l1.add(47);

        System.out.println("Original Array : " + l1);
        Collections.sort(l1);
        System.out.println("Ascending Order : " + l1);
        l1.sort(Collections.reverseOrder());
        System.out.println("Descending Order : " + l1);

        ArrayList <String> str = new ArrayList<>();

        str.add("!!!");
        str.add("Pradneya");
        str.add("Ki");
        str.add("Jai");
        str.add("!!!");
        System.out.println("Original String ArrayList : " + str);
        Collections.sort(str);
        System.out.println("Ascending Order : " + str);
        str.sort(Collections.reverseOrder());
        System.out.println("Descending Order : " + str);

    }
}
