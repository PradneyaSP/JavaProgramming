import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array : ");
        for(int i=0 ; i< n; i++ )
            arr[i]= sc.nextInt();

        int [] b = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            b[i]=arr[n-i-1];
        }

        System.out.println("The Reversed array is:  ");
        for(int i=0 ; i< n; i++ )
            System.out.print( b[i] + " ");

    }
}
