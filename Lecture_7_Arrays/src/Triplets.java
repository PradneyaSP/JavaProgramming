import java.util.Scanner;

public class Triplets {
    void target(int []a,int t){
        int []trip = new int [3];
        int flag=0;
        System.out.println("The triplets are:  ");
        for(int i=0; i<a.length ; i++){
            for(int j=i+1 ; j<a.length ; j++){
                for(int k = j+1 ; k<a.length ; k++) {
                    if (a[i] + a[j] + a[k] == t) {
                        trip[0]=a[i];
                        trip[1] = a[j];
                        trip[2]= a[k];
                        flag = 1;
                    }
                    if (flag == 1) {
                        System.out.print("(");
                        for(int m = 0 ; m <3 ; m ++)
                            System.out.print(trip[m] + " ");
                        System.out.println(")");
                        flag = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int tgt,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0 ; i< n; i++ )
            arr[i]= sc.nextInt();

        System.out.println("Enter the target sum: ");
        tgt = sc.nextInt();

        Triplets t1 = new Triplets();
        t1.target(arr,tgt);
    }
}
