import java.util.Scanner;

/*
   Bubble Sort -> Best Case O(n)
               -> Worst Case O(n2)
               -> Average Case O(n2)
               -> Space Complexity O(1)
               -> Is a Stable Sort
               -> Is an In-Place Sort
 */
public class A_BubbleSort {

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
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

        //Bubble Sort
        bubbleSort(a, n);

        System.out.print("The Sorted Array is : ");
        for (int i : a)
            System.out.print(i + " ");

    }
}
