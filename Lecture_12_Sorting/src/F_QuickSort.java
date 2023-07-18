import java.util.Scanner;

public class F_QuickSort {
    /*
    Quick Sort     -> Best Case O(nlogn)
                   -> Worst Case O(n2)
                   -> Average Case O(nlogn)
                   -> Space Complexity O(logn)/O(n)
                   -> Not a Stable Sort
                   -> Is an In-Place Sort
     */
    static void swap(int[] a, int num1, int num2) {
        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
    }

    static int partition(int[] a, int st, int end) {
        int pivot = a[st];
        int pivot_pos = 0;

        for (int i = st; i <= end; i++) {
            if (a[i] < pivot) pivot_pos++;
        }
        pivot_pos = st + pivot_pos;
        //Swapping a[st] and a[pivot_pos]
        swap(a, st, pivot_pos);

        int i = st, j = end;
        while (i < pivot_pos && j > pivot_pos) {
            while (a[i] <= pivot) i++;
            while (a[j] > pivot) j--;
            if (i < pivot_pos && j > pivot_pos) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        return pivot_pos;
    }

    static void quickSort(int[] a, int st, int end) {
        if (st >= end) return;

        int pivot = partition(a, st, end);
        quickSort(a, st, pivot - 1);
        quickSort(a, pivot + 1, end);
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        //Quick Sort
        quickSort(a, 0, n - 1);

        System.out.print("The Sorted Array is : ");
        for (int i : a)
            System.out.print(i + " ");

    }
}
