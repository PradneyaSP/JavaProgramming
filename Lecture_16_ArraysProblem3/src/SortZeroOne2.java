import java.util.Scanner;

public class SortZeroOne2 {
    static void sort(int []a){
        int left = 0 , right = a.length-1;

        while(left<right){
            if(a[left]==1 && a[right]==0){
                int temp = a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }

            if(a[left]==0)
                left++;

            if(a[right]==1)
                right--;
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
