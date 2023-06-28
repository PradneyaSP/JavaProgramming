import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter array size : ");
        Scanner sc =  new Scanner(System.in);
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0 ;i<n ; i++)
            arr[i] = sc.nextInt();

        for (int i = 0 ; i<n ;i++)
            System.out.print(arr[i] + " ");
    }
}
