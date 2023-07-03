import java.util.Scanner;

public class M_FrogJump {
    static int frogJump(int n, int[] h, int i) {
        if (i >= n - 1) return 0;

        int jump1 = frogJump(n, h, i + 1) + Math.abs(h[i] - h[i + 1]);
        if (i == n - 2)
            return jump1;

        int jump2 = Math.abs(h[i] - h[i + 2])+ frogJump(n, h, i + 2);

        return Math.min(jump1,jump2);
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of the height array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Height Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("The Minimum cost of Frog Jumps is : ");
        System.out.println(frogJump(n , arr,0));
    }
}
