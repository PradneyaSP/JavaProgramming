import java.util.Scanner;

public class FiveOrSeven {
    public static void main(String[] args) {
        int sum=0,n=6;

        while(n%5!=0 && n%7!=0){
            sum +=n ;
            n=0;
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
        }
        System.out.println("The sum is: "+ (sum-6));
    }
}
