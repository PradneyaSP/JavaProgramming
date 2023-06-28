import java.util.Scanner;

public class H_GCD {
    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.print("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.print("Enter the second number : ");
        int n = sc.nextInt();

        int gcd;
        gcd = gcd(m, n);
        System.out.println("The GCD is : " + gcd);
    }
}
