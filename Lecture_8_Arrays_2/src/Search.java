import java.util.Scanner;

public class Search {
    public static void searchArray(int [] a , int n){
        for (int i = 0 ; i<a.length ; i++){
            if(a[i]==n)
                System.out.println("Element found at " + (i+1) + "th position");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array : ");
        for(int i=0 ; i< n; i++ )
            arr[i]= sc.nextInt();

        System.out.println("Enter the number of test cases : ");
        int t= sc.nextInt();

        while(t>0){
            System.out.println("Enter the element to be searched: ");
            int s = sc.nextInt();

            searchArray(arr ,s);
            t--;
        }
    }
}
