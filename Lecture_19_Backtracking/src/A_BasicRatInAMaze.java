// Rat can go only in 2 directions Right and Down. The goal is to reach (row,col) from (1,1)

import java.util.Scanner;

public class A_BasicRatInAMaze {
    static int row, col;

    public static int numberOfWays(int i, int j, String path) {
        if (i > row || j > col) return 0;
        if (i == row && j == col) {
            System.out.println(path);
            return 1;
        }
        return numberOfWays(i + 1, j, path + "D") + numberOfWays(i, j + 1, path + "R");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the maze: ");
        row = sc.nextInt();
        col = sc.nextInt();
        System.out.println("The possible paths are: ");
        int ans = numberOfWays(1, 1, "");
        System.out.println("The number of ways is : " + ans);
    }
}
