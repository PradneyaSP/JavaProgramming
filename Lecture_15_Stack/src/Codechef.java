/* package codechef; // don't place package name! */

import java.lang.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >0 ){
            int n = sc.nextInt();
            int []p = new int[n-1];
            int max = 0;
            int sum = 0;
            for(int i = 0 ; i < n-1 ; i++) {
                p[i] = sc.nextInt();
                if(max < p[i])
                    max = p[i];
                sum+=p[i];

                System.out.println(sum+max);
            }
            t--;
        }
    }
}