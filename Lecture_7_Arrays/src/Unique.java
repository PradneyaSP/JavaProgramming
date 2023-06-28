import java.util.Scanner;

public class Unique {
    Unique(int []a ){
        int flag ;
        for(int i=0 ; i<a.length ; i++){
            flag=0;
            for(int j=0 ; j<a.length ; j++) {
                if (a[i] == a[j])
                    flag++;
            }
            if(flag == 1)
                System.out.println("The Unique element is : " + a[i]);
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

        Unique u1 = new Unique(arr);
    }
}