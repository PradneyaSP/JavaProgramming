package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix[0].length;
        int m = matrix.length;
        int startcol = 0;
        int startrow = 0;
        int endcol = n;
        int endrow = m;
        int i, j = 0;
        while (startcol < endcol && startrow < endrow) {
            for(i = startcol ; i < endcol ; i++ )
                ans.add(matrix[i][j]);
            for(j = startrow + 1; j<endrow ; j++ )
                ans.add(matrix[i][j]);
            for(i = endcol-1 ; i >= startcol ; i-- )
                ans.add(matrix[i][j]);
            for(i = endrow-1 ; i < startrow+1 ; i++ )
                ans.add(matrix[i][j]);
            System.out.println(ans);
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        return ans;
    }
}
