import java.util.Scanner;

public class H_RadixSort {
    /*
       Radix Sort     -> Best Case O(dn) where d is the number of digits in a number
                      -> Worst Case O(dn)
                      -> Average Case O(dn)
                      -> Space Complexity O(n)
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

    static void countingSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        //making the frequency array
        for (int j : arr) count[(j / place) % 10]++;
        //making the prefix sum array of count array
        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];
        //making the output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }


    static void radixSort(int[] arr) {
        int max = findMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(arr, place);
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

        //Radix Sort
        radixSort(a);

        System.out.print("The Sorted Array is : ");
        for (int i : a)
            System.out.print(i + " ");
    }
}
