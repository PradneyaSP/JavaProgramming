import java.util.ArrayList;
import java.util.Scanner;

public class J_LinearSearch {

    static int linearSearch(int[] arr, int i, int target) {
        if (i == arr.length) return -1;
        else if (arr[i] == target) return i;

        return linearSearch(arr, i + 1, target);
    }

    static ArrayList<Integer> arrayList = new ArrayList<>();

    static ArrayList<Integer> findAllIndices(int[] arr, int i, int target) {
        if (i == arr.length) return arrayList;
        else if (arr[i] == target) arrayList.add(i);

        return findAllIndices(arr, i + 1, target);
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();
        System.out.println();

        int idx = linearSearch(arr, 0, target);
        if (idx == -1) System.out.println("Element not found\n");
        else System.out.println("Element found at position " + (idx + 1) + "\n");

        System.out.print("Enter the element to be searched : ");
        target = sc.nextInt();
        System.out.println();
        System.out.print("The Element is Found at Indices : ");
        arrayList = findAllIndices(arr, 0, target);
        System.out.println(arrayList);
    }
}
