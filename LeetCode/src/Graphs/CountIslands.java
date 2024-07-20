package Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class CountIslands {
    public static class Pair {
        int row;
        int col;

        public Pair(int i, int j) {
            this.row = i;
            this.col = j;
        }
    }

    public void bfs(char[][] grid, boolean[][] visited, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(row, col));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int i = curr.row;
            int j = curr.col;
            visited[i][j] = true;

            if (i - 1 >= 0 && j < n && grid[i - 1][j] == '1' && !visited[i - 1][j]) {
                visited[i - 1][j] = true;
                q.add(new Pair(i - 1, j));
            }
            //Going down
            if (i + 1 < m && j < n && grid[i + 1][j] == '1' && !visited[i + 1][j]) {
                visited[i + 1][j] = true;
                q.add(new Pair(i + 1, j));
            }
            //Going right
            if (i < m && j + 1 < n && grid[i][j + 1] == '1' && !visited[i][j + 1]) {
                visited[i][j + 1] = true;
                q.add(new Pair(i, j + 1));
            }
            //Going left
            if (i < m && j - 1 >= 0 && grid[i][j - 1] == '1' && !visited[i][j - 1]) {
                visited[i][j - 1] = true;
                q.add(new Pair(i, j - 1));
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    islands++;
                    bfs(grid, visited, i, j);
                }
            }
        }
        return islands;
    }

    public static void main(String[] args) {
        CountIslands s = new CountIslands();
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(s.numIslands(grid));
    }
}
