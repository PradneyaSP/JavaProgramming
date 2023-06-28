import java.util.Scanner;

public class C_Fibonacci {
    //Finding the nth term of a Fibonacci Series
    static int fibonacci(int n) {
        if (n == 1 || n == 0) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fib = fibonacci(n);
        System.out.println(n + "th term of Fibonacci Series : " + fib);
    }
}
