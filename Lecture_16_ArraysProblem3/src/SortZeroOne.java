import java.util.Scanner;

public class SortZeroOne {
    static void sort(int []a){
        int zero=0,i;

        for(i=0;i<a.length;i++){
            if(a[i]==0)
                zero++;
        }

        for(i=0;i<a.length;i++){
            if(i<zero)
                a[i]=0;
            else
                a[i]=1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array : ");
        for(int i=0 ; i< n; i++ )
            arr[i]= sc.nextInt();

        sort(arr);
        System.out.println("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
