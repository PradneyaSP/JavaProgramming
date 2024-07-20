import java.util.Arrays;
import java.util.Scanner;

/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/

public class B_Fibonacci_Series_Tabulation {
    //    Returning the nth Fibonacci number using Tabulation (Bottom Up)
    public static int fibonacci(int n){
        int[] dp = new int[n+1];
//        Initialising the DP array.
        Arrays.fill(dp,-1);
//        Storing the values of base case in dp array
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i <=n ; i++) {
//        Storing the current nth fibonacci term in dp array
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.print("Enter the position of the Fibonacci number required : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = fibonacci(n);
        System.out.println("The nth fibonacci term is : " + ans);
    }
}
