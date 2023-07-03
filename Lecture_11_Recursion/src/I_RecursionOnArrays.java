import java.util.Scanner;

public class I_RecursionOnArrays {
    static void printArray(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        printArray(arr, i + 1);
    }

    static int maxElement(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return Math.max(maxElement(arr, i + 1), arr[i]);
    }

    static int sumArray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumArray(arr, i + 1);
    }

    static void sumOfSubsets(int[] arr,int i , int currAns){
        if(i >= arr.length){
            System.out.print(currAns + " ");
            return;
        }
        sumOfSubsets(arr,i+1, currAns+arr[i]);
        sumOfSubsets(arr,i+1,currAns);
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("\nThe Entered array is : ");
        printArray(arr, 0);

        System.out.print("\nThe Maximum Element is : ");
        System.out.println(maxElement(arr, 0));

        System.out.print("The Sum of All Elements is : ");
        System.out.println(sumArray(arr, 0));

        System.out.print("The Sum of All Elements of the Sub-Arrays : ");
        sumOfSubsets(arr,0,0);
    }
}
