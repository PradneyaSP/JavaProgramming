import java.util.Scanner;

public class E_LogarithmicPower {
    //Logarithmic Multiplication
    static int power(int p, int q) {
        if (q == 0) return 1;
        int pow = power(p, q / 2);
        if (q % 2 == 0)
            return pow * pow;
        else
            return p * pow * pow;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter the power : ");
        int pow = sc.nextInt();

        int ans = power(n, pow);
        System.out.println("The answer is : " + ans);
    }
}
