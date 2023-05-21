import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for (int i = n ;i>=0;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
