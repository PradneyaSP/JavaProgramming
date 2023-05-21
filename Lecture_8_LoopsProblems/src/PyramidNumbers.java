import java.util.Scanner;

public class PyramidNumbers {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i =1 ; i<n ; i++){
            int m=i;
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= 2*i-1 ; k++ ){
                if(k<i)
                    System.out.print(k);
                else
                    System.out.print(m--);
            }
            System.out.println();
        }
    }
}
