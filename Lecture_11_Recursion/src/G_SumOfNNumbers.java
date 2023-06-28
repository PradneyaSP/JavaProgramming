import java.util.Scanner;

public class G_SumOfNNumbers {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    static int sum2(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0)
            return sum2(n - 1) - n;
        else
            return sum2(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = sum(n);
        System.out.println("The Sum of Natural Numbers till " + n + " is : " + total);

        int total2 = sum2(n);
        System.out.println("The Sum of Series is : " + total2);
    }
}
