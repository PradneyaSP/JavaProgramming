import java.util.*;

public class Solution {
    boolean ans = false;
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        helper(grid, 0, 0, -1);
        return ans;
    }

    private void helper(int[][] grid, int i, int j, int count) {
        int n = grid.length;
        if (count == n * n -1) ans = true;
        if (i >= n || j >= n || i < 0 || j < 0 || grid[i][j] != count + 1 ) return;
        System.out.println(count);
        helper(grid , i+1 , j-2 , count +1);
        helper(grid , i+2 , j-1 , count +1);
        helper(grid , i+2 , j+1 , count +1);
        helper(grid , i+1 , j+2 , count +1);
        helper(grid , i-1 , j+2 , count +1);
        helper(grid , i-2 , j+1 , count +1);
        helper(grid , i-2 , j-1 , count +1);
        helper(grid , i-1 , j-2 , count +1);
    }

    public static void main(String[] args) {
//        Solution k = new Solution();
//        int[][] grid = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
//        System.out.println(k.checkValidGrid(grid));
        char [] b = {'1','2','3'};
        b[2] = 4+48;
        System.out.println(b);
    }
}
