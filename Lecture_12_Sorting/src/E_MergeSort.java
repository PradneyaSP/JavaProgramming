import java.util.Scanner;

/*
Merge Sort     -> Best Case O(nlogn)
               -> Worst Case O(nlogn)
               -> Average Case O(nlogn)
               -> Space Complexity O(n)
               -> Is a Stable Sort
               -> Not an In-Place Sort
 */
public class E_MergeSort {
    static void merge(int[] a, int l, int mid, int r) {
        int i, j, k;
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (i = 0; i < n1; i++) left[i] = a[l + i];
        for (j = 0; j < n2; j++) right[j] = a[mid + j + 1];

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                a[k++] = left[i++];
            else
                a[k++] = right[j++];
        }

        while (i < n1)
            a[k++] = left[i++];

        while (j < n2)
            a[k++] = right[j++];
    }

    static void mergeSort(int[] a, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        //Merge Sort
        mergeSort(a, 0, n - 1);

        System.out.print("The Sorted Array is : ");
        for (int i : a)
            System.out.print(i + " ");

    }
}
