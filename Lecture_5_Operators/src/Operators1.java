import java.util.Scanner;

//Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
// is taken with 5 and then multiply the resultant value by 5. Display the final result.
public class Operators1 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        x = (((x+8)/3)%5)*5;

        System.out.println("The new value is: "+ x);
    }
}
