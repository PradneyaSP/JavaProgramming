import java.util.Scanner;

public class RepeatingElement {
    public static void repeating(int []a)
    {
        int i,j=0,flag=0;
        search:
        {
            for (i = 0; i < a.length; i++)
            {
                for (j = i + 1; j < a.length; j++)
                {
                    if(a[i]==a[j]) {
                        flag = 1;
                        break search;
                    }
                }
            }
        }

        if(flag==1)
            System.out.println("The element "+ a[i] + " is repeating at position "+(i+1)+" & "+ (j+1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0 ; i< n; i++ )
            arr[i]= sc.nextInt();

        repeating(arr);

    }
}
