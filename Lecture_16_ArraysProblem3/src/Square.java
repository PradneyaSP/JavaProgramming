import java.util.*;

public class Square {
    static void reverse(int []a){
        int []b = a.clone();

        for(int i=0 ; i< a.length ; i++)
            a[i]=b[a.length-1-i];
    }
    static int[] square(int []a){
        int left=0 ,right=a.length-1;
        int n=a.length,k=0;

        int []ans = new int[n];

        while(left<=right){
            if(Math.abs(a[left])>Math.abs(a[right])){
                ans[k++]=a[left]*a[left];
                left++;
            }
            else{
                ans[k++]=a[right]*a[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int []ans = square(arr);
        reverse(ans);
        System.out.println("Squared Array: ");
        for (int i = 0 ; i <arr.length; i++)
            System.out.print(ans[i] + " ");

    }
}
