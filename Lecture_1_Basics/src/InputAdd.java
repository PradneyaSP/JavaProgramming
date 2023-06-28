import java.sql.SQLOutput;
import java.util.Scanner;

public class InputAdd {
    public static void main(String[] args) {
        int num1,num2;

        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("The sum is "+ (num1+num2));
    }
}
