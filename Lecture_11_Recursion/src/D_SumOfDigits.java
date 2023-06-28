import java.util.Scanner;

//Program to print the sum of all digits
public class D_SumOfDigits {
    static int sumOfDigit(int n) {
        if (n >= 0 && n <= 9) return n;
        return n % 10 + sumOfDigit(n / 10);
    }

    static int numberOfDigits(int n){
        if(n==0)return 0;
        return 1+numberOfDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sumOfDigit(n);
        int count = numberOfDigits(n);
        System.out.println("The Sum of Digits of " + n + " is : " + sum);
        System.out.println("The Number of Digits in " + n + " is : " + count);
    }
}
