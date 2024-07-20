package Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottenOranges {
    static class Orange {
        int row;
        int col;
        int time;
        public Orange(int r, int c, int t){
            this.row = r;
            this.col = c;
            this.time = t;
        }
    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int time = 0;
        Queue<Orange> q = new ArrayDeque<>();

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 2) {
                    grid[i][j] = 2;
                    q.add(new Orange(i, j, 0));
                }
            }
        }

        while(!q.isEmpty()){
            Orange curr = q.poll();
            int i = curr.row;
            int j = curr.col;
            int t = curr.time;
            time = Math.max(time,t);
            //Going up
            if(i-1 >= 0 && j < n && grid[i-1][j] == 1) {
                grid[i-1][j] = 2;
                q.add(new Orange(i - 1, j, t + 1));
            }
            //Going down
            if(i+1 < m && j < n && grid[i+1][j] == 1 ) {
                grid[i+1][j] = 2;
                q.add(new Orange(i + 1, j, t + 1));
            }
            //Going right
            if(i < m && j+1 < n && grid[i][j+1] == 1 ) {
                grid[i][j+1] = 2;
                q.add(new Orange(i, j + 1, t + 1));
            }
            //Going left
            if(i < m && j-1 >= 0 && grid[i][j-1] == 1 ) {
                grid[i][j-1] = 2;
                q.add(new Orange(i, j - 1, t + 1));
            }
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 1)
                    return -1;
            }
        }

        return time;
    }

    public static void main(String[] args) {
        RottenOranges s = new RottenOranges();
        int[][] grid = {{2,2},{1,1},{0,0},{2,0}};
        System.out.println(s.orangesRotting(grid));
    }
}
