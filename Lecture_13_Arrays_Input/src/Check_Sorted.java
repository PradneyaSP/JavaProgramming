import java.util.Scanner;

public class Check_Sorted {
    static void sortCheck(int []a){
        int flag=0;
        for(int i = 0 ; i < a.length-1 ; i++){
            if(a[i]>a[i+1])
                flag =1 ;
            }
        if(flag==1)
            System.out.println("Array is not sorted");
        else
            System.out.println("Array is sorted");
    }

    public static void main(String[] args) {
        int [] a = new int [10];

        System.out.println("Enter the array: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i <10 ; i++)
            a[i]=sc.nextInt();

        sortCheck(a);
    }
}
