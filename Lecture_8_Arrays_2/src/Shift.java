import java.util.Scanner;

public class Shift {

    public static void shiftArray(int [] a , int [] b , int t){
        int i=0 , j =t ,k=0;

        while(j>a.length){
            j=j-a.length;
        }
        for(;j<a.length;i++,j++){
            b[j]=a[i];
        }

        while(i<a.length){
            b[k++]=a[i++];
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

        int [] b = new int[n];

        System.out.println("Enter the number of positions to be shifted: ");
        int sh = sc.nextInt();

        shiftArray(arr,b,sh);

        System.out.println("The Shifted array is:  ");
        for(int i=0 ; i< n; i++ )
            System.out.print( b[i] + " ");
    }
}
