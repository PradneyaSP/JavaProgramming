import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        int a , b;

        System.out.println("Enter 2 numbers :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.println("The swapped numbers are : " + a + " & " + b);
    }
}
