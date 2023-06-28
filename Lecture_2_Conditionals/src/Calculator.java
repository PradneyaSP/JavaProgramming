import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char sign;
        float x , y;

        System.out.println("Enter an operator(+,-,*,/): ");
        Scanner sc = new Scanner(System.in);
        sign = sc.next().charAt(0);

        System.out.println("Enter two numbers: ");
        x = sc.nextFloat();
        y = sc.nextFloat();

        switch (sign){
            case '+':
                System.out.println(x + " + " + y + " = " + (x+y));
                break;
            case '-':
                System.out.println(x + " - "+y+" = "+(x-y));
                break;
            case '*':
                System.out.println(x+" * "+y+" = "+(x*y));
                break;
            case '/':
                System.out.println(x+" / "+y+" = "+(x/y));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

}
