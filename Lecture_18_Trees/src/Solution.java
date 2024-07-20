import java.util.Arrays;

public class Solution {
    public int numberOfBeams(String[] bank) {
        int m = bank.length;
        int n = bank[0].length();
        int prevCount = -1;
        int ans = 0;
        for(int i = 0 ; i < m ; i++){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                if(bank[i].charAt(j) == '1'){
                    count++;
                }
            }
            if(prevCount != -1) {
                ans += count * prevCount;
                prevCount = -1;
            }
            if(count != 0)
                prevCount = count;
        }
        return ans;
    }
    public int maximumLength(String s) {
        int max = -1;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String sp = s.substring(i,j);
                if(isSpecial(sp)){
                    int count = 0;
                    int l = sp.length();
                    for(int k = 0 ; k<=s.length() - sp.length() ; k++){
                        if(sp.equals(s.substring(k , k+ l)))
                            count++;
                    }
                    if(count > 2 && max < sp.length())
                        max = sp.length();
                }
            }
        }

        return max;
    }

    private boolean isSpecial(String sp) {
        boolean flag = true;
        for(int i = 1 ; i < sp.length() ; i++) {
            if (sp.charAt(i) != sp.charAt(i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    int[] findMinMax(TreeNode root) {
        int max = 0;
        int min = 0;
        TreeNode head = root;
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr)
                    pred = pred.right;

                if (pred.right == curr) {
                    pred.right = null;
                    if (curr != head) {
                        if (max < curr.val)
                            max = curr.val;
                        if (min > curr.val)
                            min = curr.val;
                    }
                    curr = curr.right;
                } else {
                    pred.right = curr;
                    curr = curr.left;
                }
            } else {
                if (curr != head) {
                    if (max < curr.val)
                        max = curr.val;
                    if (min > curr.val)
                        min = curr.val;
                }
                curr = curr.right;
            }
        }
        int[] result = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }

    public int maxAncestorDiff(TreeNode root) {
        System.out.println(Arrays.toString(findMinMax(root)));
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximumLength("abcaba"));
    }
}
