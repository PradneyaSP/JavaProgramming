import java.util.Scanner;

public class Repeat {
    static int occurrence (int []a,int n){
        int count=0;
        for(int i = 0 ; i <a.length ; i++){
            if (a[i] == n)
                count++;
        }
        return  count;
    }

    static int lastOccurrence(int[] a , int n){
        int last=-1;
        for(int i = 0 ; i <a.length ; i++){
            if (a[i] == n)
                last = i;
        }
        return last;
    }

    public static void main(String[] args) {
        int [] a = new int [10];

        System.out.println("Enter the array: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i <10 ; i++)
            a[i]=sc.nextInt();

        System.out.println("Enter the element");
        int n = sc.nextInt();

        int occ = occurrence(a,n);
        int l = lastOccurrence(a,n);

        if (l > 0) {
            System.out.println(n + " is last found at " +l);
            System.out.println(n + " is repeated " + occ + " times.");
        }
        else
            System.out.println("Element not found");

    }
}
