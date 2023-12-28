import java.util.Scanner;

public class B_FourDirectionsMazeRat {
    static int row, col;

    public static void printPaths(int i, int j, String path, boolean[][] isVisited) {
        if (i < 0 || j < 0 || i >= row || j >= col) return;

        if (isVisited[i][j]) return;
        if (i == row - 1 && j == col - 1) {
            System.out.println(path);
            return;
        }
        isVisited[i][j] = true;
        printPaths(i + 1, j, path + "D", isVisited);
        printPaths(i, j + 1, path + "R", isVisited);
        printPaths(i - 1, j, path + "U", isVisited);
        printPaths(i, j - 1, path + "L", isVisited);
//        Note that for backtracking you need to uncheck previously marked to find new paths.
        isVisited[i][j] = false; // Backtracking
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the maze: ");
        row = sc.nextInt();
        col = sc.nextInt();
        boolean[][] isVisited = new boolean[row][col];

        System.out.println("The possible paths are: ");
        printPaths(0, 0, "", isVisited);
    }
}
