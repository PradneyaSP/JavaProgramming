import java.util.Scanner;

public class G_CountSort {
    /*
    Count Sort     -> Best Case O(n)
                   -> Worst Case O(k) where k>>> n
                   -> Average Case O(n+k)
                   -> Space Complexity O(n + k)
                   -> Is a Stable Sort
                   -> Not an In-Place Sort
     */
    static int findMax(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) max = i;
        }
        return arr[max];
    }

    static void countSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];

        int max = findMax(arr);
        int[] count = new int[max + 1];

        for (int j : arr) count[j]++;

        //prefix sum array of count array
        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        //generating output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        //copying output to arr
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        //Count Sort
        countSort(a);
        System.out.print("The Sorted Array is : ");
        for (int i : a)
            System.out.print(i + " ");
    }
}
