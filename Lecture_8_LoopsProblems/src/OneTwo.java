import java.util.Scanner;

public class OneTwo {
    public static void main(String[] args) {
        int n,k=1;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(k);
                if(k==1)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }

    }
}
