import java.util.Scanner;

public class SwapWIth2Var {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        x=x+y;
        y=x-y;   //y=x
        x=x-y;

        System.out.println("The swapped numbers are: "+ x + " & "+ y);
    }
}
