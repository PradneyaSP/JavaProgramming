import java.util.Scanner;

public class Smallest_Largest {
    int[] SmallestLargest(int[] a){
        int i=0,min=0,max=0;
        int []b = new int [2];
        while(i<a.length){
            if(a[i]<a[min]){
                min = i ;
                b[0] = a[i];
            }
            if(a[i]>a[max]){
                max = i;
                b[1] = a[i];
            }
            i++;
        }

        return b;
    }

    public static void main(String[] args) {
        int [] a = new int [10];

        System.out.println("Enter the array: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i <10 ; i++)
            a[i]=sc.nextInt();

        Smallest_Largest s1 = new Smallest_Largest();

        int [] ans = s1.SmallestLargest(a);

        System.out.println("Smallest element : "+ans[0]);
        System.out.println("Largest element : "+ans[1]);
    }
}
