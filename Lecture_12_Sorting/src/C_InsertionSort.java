import java.util.Arrays;
import java.util.Scanner;

/*
Insertion Sort -> Best Case O(n)
               -> Worst Case O(n2)
               -> Average Case O(n2)
               -> Space Complexity O(1)
               -> Is a Stable Sort
               -> Is an In-Place Sort
 */
public class C_InsertionSort {

    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int key = a[i], j;
            for (j = i - 1; j >= 0 && a[j] > key; j--)
                a[j + 1] = a[j];

            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the length of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        //Insertion Sort
        insertionSort(a, n);

        System.out.print("The Sorted Array is : ");
        for (int i : a)
            System.out.print(i + " ");

    }
}
