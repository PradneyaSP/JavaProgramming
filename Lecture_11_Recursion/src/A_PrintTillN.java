import java.util.Scanner;

public class A_PrintTillN {
    //Printing numbers from n to 1
    public static void print(int n){
        //Base Case
        if(n==0)
            return;
        //Self Work
        System.out.print(n+" ");
        //Recursion
        print(n-1);
    }
    //To print numbers from 1 to n swap line 10 and 12
    public static void main(String[] args) {
        System.out.print("Enter the last number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("\nData Printed through Recursion : ");
        print(n);
    }
}
