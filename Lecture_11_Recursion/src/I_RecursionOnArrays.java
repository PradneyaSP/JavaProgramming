import java.util.Scanner;

public class I_RecursionOnArrays {
    static void printArray(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        printArray(arr, i + 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("The Entered array is : ");
        printArray(arr,0);
        System.out.println();
    }
}
