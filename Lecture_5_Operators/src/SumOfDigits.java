import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a 3 digit number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int y= x%10;
        x=x/10;
        int z=x%10;
        x=x/10;

        System.out.println("The sum of digits is: " + (x+y+z));
    }
}
