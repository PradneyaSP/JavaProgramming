import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n<0){
            System.out.println("The absolute value is: " + (-n));
        }else{
            System.out.println("The absolute value is: " + n);
        }
    }
}
