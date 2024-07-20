import java.util.Arrays;
import java.util.Scanner;

/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/

public class A_Fibonacci_Series_Memoization {
//    Returning the nth Fibonacci number using Recursion + Memoization
    public static int fibonacci(int n , int[] dp){
        if(n==0 || n==1)
            return n;
//        Since dp[n] != -1 then it means that the nth fibonacci term has already been calculated
//        there's no need to calculate again
        if(dp[n] != -1)
            return dp[n];
//        Storing the current nth fibonacci term in dp array
        dp[n] = fibonacci(n-1 , dp) + fibonacci(n-2 , dp);
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println("Enter the position of the Fibonacci number required : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
//        Initialising the DP array.
        Arrays.fill(dp,-1);

        int ans = fibonacci(n,dp);
        System.out.println("The nth fibonacci term is : " + ans);
    }
}
