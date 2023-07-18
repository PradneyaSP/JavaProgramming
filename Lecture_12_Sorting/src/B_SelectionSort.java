import java.util.Scanner;

/*
Selection Sort -> Best Case O(n2)
               -> Worst Case O(n2)
               -> Average Case O(n2)
               -> Space Complexity O(1)
               -> Not a Stable Sort
               -> Is an In-Place Sort
 */
public class B_SelectionSort {
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
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

        //Selection Sort
        selectionSort(a, n);

        System.out.print("The Sorted Array is : ");
        for (int i : a)
            System.out.print(i + " ");

    }
}
