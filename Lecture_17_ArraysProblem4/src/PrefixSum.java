import java.util.Scanner;

public class PrefixSum {
    static void prefix(int []a){
//        int []pre=new int [a.length];
//        pre[0]=a[0];
//        for(int i=1 ; i<a.length ; i++){
//            pre[i]=pre[i-1]+a[i];
//        }
//
//        System.out.println("The Prefix Sum Array is: ");
//        for (int i = 0; i < a.length; i++)
//            System.out.print(pre[i]+" ");
//
//        System.out.println();
//        return pre[n];

        for(int i=1 ; i<a.length ; i++){
            a[i]=a[i-1]+a[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the index of the prefix sum: ");
        int x = sc.nextInt();

        prefix(arr);

        System.out.println("Prefix Sum: "+ arr[x]);

        System.out.println("The Prefix Sum Array is: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

    }
}
