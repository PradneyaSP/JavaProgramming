import java.util.Scanner;
class Algebra{
    int add( int a, int b) {
        int sum = a + b;
        return sum;
    }
}
public class Sum {

    public static void main(String[] args) {
        int a,b,c;

        Algebra a1 = new Algebra();

        System.out.println("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a1.add(a,b);
        System.out.println("The sum is "+ c);
    }
}
