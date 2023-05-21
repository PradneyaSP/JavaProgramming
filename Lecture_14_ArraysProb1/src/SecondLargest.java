import java.util.Scanner;

public class SecondLargest {
    public static int Largest(int []a)
    {
        int max=0;
        for(int i=0 ; i <a.length ; i++)
        {
            if(a[i]>a[max]){
                max = i;
            }
        }
        return a[max];
    }

    public static int SecLargest(int []arr)
    {
        int max = Largest(arr);

        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==max)
                arr[i]=Integer.MIN_VALUE;
        }

        max = Largest(arr);
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0 ; i< n; i++ )
            arr[i]= sc.nextInt();


        int m =  SecLargest(arr);

        System.out.println("The Second Largest element is : "+ m);


    }
}
