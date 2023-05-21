import java.util.Scanner;

public class NumRec {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i =1 ; i<=n ; i++){
            for (int j=i ; j<=n ; j++ ){
                System.out.print(j);
            }
            for(int k=1 ; k<i ; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
