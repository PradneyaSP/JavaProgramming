import java.lang.*;
import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1, count = 0;
        while (left <= right) {
            if (nums[right] == val) right--;
            if (nums[left] == val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
                System.out.println(nums[left]);
                left++;
            }
            if (nums[left] != val) {
                left++;
                System.out.println(nums[left]);
            }
        }

        return count;

    }


    public int minPartitions(String n) {
        char max = '0';
        for (int i = 0; i < n.length(); i++) {
            for (char c : n.toCharArray()) {
                if (c > max) max = c;
            }
        }

        return max - '0';
    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            for (int[] point : points) {
                if (((queries[j][0] - point[0]) * (queries[j][0] - point[0]) + (queries[j][1] - point[1]) * (queries[j][1] - point[1])) < (queries[j][2] * queries[j][2])) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }

    public boolean isValid(String s) {
        int top = -1;
        boolean flag = true;
        char[] brackets = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0) brackets[++top] = ch;
            else if (top != -1 && ch == '}' && brackets[top] == '{') top--;
            else if (top != -1 && ch == ')' && brackets[top] == '(') top--;
            else if (top != -1 && ch == ']' && brackets[top] == '[') top--;
            else brackets[++top] = ch;
        }

        if (top != -1)
            flag = false;

        return flag;
    }

    public static String compare(String st) {
        StringBuilder str = new StringBuilder();
        for (int i = 0, k = -1; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '#')
                str.deleteCharAt(k--);
            else {
                str.append(ch);
                k++;
            }
        }
        return str.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }

    public String interpret(String command) {
        char[] goal = new char[command.length()];
        for (int i = 0, k = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                goal[k++] = 'o';
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                goal[k++] = 'a';
                goal[k++] = 'l';
                i += 3;
            } else {
                goal[k++] = 'G';
            }
        }
        String c = new String(goal);
        return c;
    }

    public static int Mycompress(char[] chars) {
        StringBuilder str = new StringBuilder("");
        int count = 0;
        str.append(chars[0]);
        char prev = chars[0];
        for (final char curr : chars) {
            if (curr == prev) {
                count++;
            } else {
                if (count > 1)
                    str.append(count);
                str.append(curr);
                count = 1;
            }
            prev = curr;
        }

        if (count > 1)
            str.append(count);
        chars = str.toString().toCharArray();

        return chars.length;
    }

    public static int compress(char[] chars) {
        int ans = 0;

        for (int i = 0; i < chars.length; ) {
            final char letter = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }
            chars[ans++] = letter;
            if (count > 1)
                for (final char c : String.valueOf(count).toCharArray())
                    chars[ans++] = c;
        }

        return ans;
    }

    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ')
                    count++;
            }
            count++;
            System.out.println(count);
            if (ans < count)
                ans = count;
        }
        return ans;
    }

    public String defangIPaddr(String address) {
        StringBuilder add = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (add.charAt(i) == '.') {
                add.append("[.]");
            } else {
                add.append(address.charAt(i));
            }
        }
        return add.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] sen = new String[3];
        sen[0] = "alice and bob love leetcode";
        sen[1] = "i think so too";
        sen[2] = "this is great thanks very much";
        int ans = s.mostWordsFound(sen);
        System.out.println(ans);
    }
}
