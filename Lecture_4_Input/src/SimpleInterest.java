import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p,r,t;

        System.out.println("Enter principle,rate and interest");
        Scanner sc = new Scanner(System.in);

        p= sc.nextFloat();
        r= sc.nextFloat();
        t= sc.nextFloat();

        float si= (p*r*t)/100;

        System.out.println("The Simple Interest is "+ si);
    }
}
