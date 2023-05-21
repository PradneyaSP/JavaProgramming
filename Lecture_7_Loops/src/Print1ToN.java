import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter the last number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int m=1;
        System.out.println("While loop: ");
        while(m<=n){
            System.out.print( m + " ");
            sum+=m;
            m++;
        }

        System.out.println();
        System.out.println("For loop: ");
        for(m=1 ; m<=n ; m++){
            System.out.print(m + " ");
        }

        m=1;
        System.out.println();
        System.out.println("Do while loop:");
        do{
            System.out.print((m++) + " ");
        }while(m<=n);

        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
