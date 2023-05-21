import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {
        int r,c ;

        System.out.println("Enter the numbers of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();

        for (int i = 0; i<r;i++){
            for (int j=0;j<c;j++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }
}
