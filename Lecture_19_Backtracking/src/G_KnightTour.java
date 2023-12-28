public class G_KnightTour {
    public boolean checkValidGrid(int[][] grid) {
        return helper(grid, 0, 0, 0);
    }

    private boolean helper(int[][] grid, int x, int y, int count) {
        int n = grid.length;
        if (count == n * n -1) return true;
        int[] nextPositions = new int[2];
        if (isNextStepCorrect(grid, x, y, count, nextPositions)) {
            return helper(grid, nextPositions[0], nextPositions[1], count + 1);
        }
        return false;
    }

    private boolean isNextStepCorrect(int[][] grid, int x, int y, int count, int[] nextPositions) {
        int n = grid.length;
        int i, j;
        // pos 1
        i = x + 1;
        j = y - 2;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }
        // pos 2
        i = x + 2;
        j = y - 1;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }
        // pos 3
        i = x + 2;
        j = y + 1;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }
        // pos 4
        i = x + 1;
        j = y + 2;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }
        // pos 5
        i = x - 1;
        j = y + 2;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }
        // pos 6
        i = x - 2;
        j = y + 1;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }
        // pos 7
        i = x - 2;
        j = y - 1;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }
        // pos 8
        i = x - 1;
        j = y - 2;
        if (i < n && j < n && i >= 0 && j >= 0 && grid[i][j] == count + 1) {
            nextPositions[0] = i;
            nextPositions[1] = j;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        G_KnightTour k = new G_KnightTour();
        int[][] grid = {{8,3,6},{5,0,1},{2,7,4}};
        System.out.println(k.checkValidGrid(grid));
    }
}
