import java.util.*;

public class EvenAndOdd {
    static void rearrange(int []a){
        int left=0 ,right=a.length-1;

        while(left<right){
            if(a[left]%2==1 && a[right]%2==0){
                int temp = a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }

            if(a[left]%2==0)
                left++;

            if(a[right]%2==1)
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

        rearrange(arr);

        System.out.println("Rearranged Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
