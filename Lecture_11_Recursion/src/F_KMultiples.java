import java.util.Scanner;

public class F_KMultiples {
    static void multiples( int n , int k){
        if(k==0) return;
        multiples(n,k-1);
        System.out.print(n*k + " ");
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter the number of Multiples : ");
        int k = sc.nextInt();

        System.out.print("The Multiples are : ");
        multiples(n,k);
        System.out.println();
    }
}
