/*
       A maze is an N*M binary matrix of blocks where the upper left block is known as
   the Source block, and the lower rightmost block is known as the Destination block.
   If we consider the maze, then maze[O][O] is the source, and maze[N-1][N-1] is the
   destination. Our main task is to reach the destination from the source. We have
   considered a rat as a character that can move either forward, downwards, upwards or backwards.
   In the maze matrix, a few dead blocks will be denoted by O and active blocks will
   be denoted by 1. A rat can move only in the active blocks.
*/

import java.util.Scanner;

public class C_OriginalRatInAMaze {
    static int row = 4, col = 6 , count = 0;
    static int[][] maze = {{1, 1, 1, 0, 1, 0},
                            {1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 0, 1, 0},
                            {1, 0, 0, 1, 1, 1}};

    static void findPath(int i, int j, String path) {
        if (i < 0 || j < 0 || i >= row || j >= col) return;
        if ((maze[i][j] == 0) || (maze[i][j] == -1)) return;
        if(i == row-1 && j == col-1){
            System.out.println(path);
            count++;
            return;
        }

        maze[i][j] = -1;

        findPath(i + 1, j, path + "D");
        findPath(i, j + 1, path + "R");
        findPath(i - 1, j, path + "U");
        findPath(i, j - 1, path + "L");

        maze[i][j] = 1;
    }

    public static void main(String[] args) {
        System.out.println("The possible paths are: ");
        findPath(0, 0, "");
        if(count == 0)
            System.out.println("No Possible paths");
    }
}
