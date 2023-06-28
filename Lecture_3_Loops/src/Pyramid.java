import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int r;

        System.out.println("Enter the rows");
        Scanner sc = new Scanner(System.in);
        r= sc.nextInt();
        
        for(int i=1;i<=r;i++){
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
