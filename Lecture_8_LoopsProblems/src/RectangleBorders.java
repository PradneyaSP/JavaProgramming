import java.util.Scanner;

public class RectangleBorders {
    public static void main(String[] args) {
        int r,c;

        System.out.println("Enter the numbers of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();

        for (int i=1 ; i<=r ; i++){
            for (int j=1 ; j<=c ; j++){
                if (i==1 || i==r || j==1 || j==c)
                    System.out.print("* ");
                else
                    System.out.print("  ");;

            }
            System.out.println();
        }

    }
}
