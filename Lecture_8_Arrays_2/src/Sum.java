import java.util.Scanner;

public class Sum {
    static void prefix(int []a){
        for(int i=1 ; i<a.length;i++){
            a[i]=a[i]+a[i-1];
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

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();

        prefix(arr);

        while(q>0){
            System.out.println("Enter the first and last position to find the sum");
            int first = sc.nextInt();
            int last = sc.nextInt();

            if(first>1)
                System.out.println("The Sum is : "+ (arr[last-1]-arr[first-2]));
            else
                System.out.println("The Sum is: " + arr[last-1]);
            q--;
        }
    }
}
