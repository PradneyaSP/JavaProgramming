import java.util.Arrays;
import java.util.Scanner;

public class D_SortingProblem {
    static void bubbleZero(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] == 0 && a[j + 1] != 0) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void fruitSort(String[] str) {
        for (int i = 0; i < str.length; i++) {
            int min = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[min].compareTo(str[j]) > 0)
                    min = j;
            }
            String temp = str[min];
            str[min] = str[i];
            str[i] = temp;
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
        bubbleZero(a);

        System.out.print("The Array After Sorting the Zeros is : ");
        for (int i : a)
            System.out.print(i + " ");

        String[] str = {"cotton", "cot", "cottage", "cashew", "coconut", "apple"};
        fruitSort(str);
        System.out.println("\n" + Arrays.toString(str));
    }
}
