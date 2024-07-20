import java.util.Scanner;

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/

public class C_Fibonacci_Series_Space_Optimisation {
    //    Returning the nth Fibonacci number using Space Optimisation (Bottom Up)
    public static int fibonacci(int n){
//    Here we notice that the value of a fibonacci term depends only on the prev 2 terms.
//    Hence, there is no need to store the rest of the terms.
        int prev2 = 0;
        int prev1 = 1;
        for(int i = 2 ; i <=n ; i++) {
//            Shift Logic
            int temp = prev1;
            prev1 = prev1 + prev2;
            prev2 = temp;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.print("Enter the position of the Fibonacci number required : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = fibonacci(n);
        System.out.println("The nth fibonacci term is : " + ans);
    }
}
