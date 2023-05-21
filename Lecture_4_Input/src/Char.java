import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        char ch;

        System.out.println("Enter the character :");
        Scanner sc = new Scanner(System.in);

        ch= sc.next().charAt(0);

        System.out.println("The character typed is "+ ch);
    }
}
