import java.util.Scanner;

public class B_Factorial {

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = factorial(n);
        System.out.println("Factorial : " + fact);
    }
}
