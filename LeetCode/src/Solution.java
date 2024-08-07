import java.util.*;

import static java.util.Collections.sort;

class Solution {
    public void segregateElements(int arr[], int n) {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int k = 0;
        for (Integer po : pos) arr[k++] = po;

        for (Integer integer : neg) arr[k++] = integer;

    }

    void reverse(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums.length == 0 || nums.length == 1) return 0;

        nums[0] = nums[0] + k;
        nums[nums.length - 1] -= k;
        if (nums[0] > nums[nums.length - 1]) return 0;
        else return nums[nums.length - 1] - nums[0];
    }

    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums.length == 0 || nums.length == 1) return 0;

        for (int num : nums) {
            num += k;
        }

        nums[0] += 2 * k;

        return nums[0] - nums[nums.length - 1];
    }

    public int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < score.length - i - 1; j++) {
                if (score[j][k] > score[j + 1][k]) {
                    int[] temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        return score;
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;

        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(nums, n, i);

        int i = nums.length - 1;
        int temp = k;
        while (temp > 0) {
            swap(nums, i, 0);
            heapify(nums, i, 0);
            temp--;
        }
        System.out.println(Arrays.toString(nums));
        return nums[n - k];
    }

    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) ans.add("FizzBuzz");
            else if (i % 3 == 0) ans.add("Fizz");
            else if (i % 5 == 0) ans.add("Buzz");
            else ans.add(String.valueOf(i));
        }
        return ans;
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            else count++;
        }
        return count;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode prev = newHead;
        ListNode curr = head;
        ListNode then = head;

        int count = 0;
        int rev = 0;
        while (count < size / k) {
            ListNode a = prev;
            rev = 0;
            while (rev < k) {
                then = curr.next;
                curr.next = prev;
                prev = curr;
                curr = then;
                rev++;
            }
            a.next = prev;

            for (int i = 1; i < k; i++)
                prev = prev.next;
            count++;
        }
        prev.next = curr;
        return newHead.next;
    }

    public boolean isPalindrome(String s) {
        boolean flag = true;
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);
            if (Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)) {
                if (a == b) {
                    left++;
                    right--;
                } else return false;
            } else if (!Character.isLetter(a)) left++;
            else right--;
        }
        return flag;
    }

    public String simplifyPath(String path) {
        String[] folders = path.split("/");
        Stack<String> st = new Stack<>();

        for (String folder : folders) {
            if (folder.isEmpty() || folder.equals(".")) continue;
            else if (folder.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else st.push(folder);
        }

        return "/" + String.join("/", st);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int n = 0; n < numRows; n++) {
            int c = 1;
            List<Integer> l = new ArrayList<>();
            for (int r = 1; r <= n; r++) {
                l.add(c);
                c = c * (n - r + 1) / r;
            }
            ans.add(l);
        }

        return ans;
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxRows = new int[grid.length];
        int[] maxCols = new int[grid.length];
        int n = grid.length;
        //Finding the maximum in each row
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++)
                if (max < grid[i][j]) max = grid[i][j];
            maxRows[i] = max;
        }
        //Finding the maximum in each column
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++)
                if (max < grid[j][i]) max = grid[j][i];
            maxCols[i] = max;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(maxRows[i], maxCols[j]) - grid[i][j];
            }
        }
        return ans;
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;
        while (left < right) {
            int tempArea = Math.min(height[left], height[right]) * (right - left);
            if (area < tempArea) area = tempArea;
            if (height[left] < height[right]) left++;
            else right--;
        }
        return area;
    }

    public static double myPow(double x, int n) {
        if (n >= 0) return newPow(x, n);
        else return 1 / newPow(x, -n);
    }

    public static double newPow(double x, int n) {
        if (n == Integer.MAX_VALUE && x < 1 && x >= 0) return 0;
        else if (n == Integer.MAX_VALUE && x == 1) return 1;
        if (n == 0) return 1;

        if (n % 2 == 0) return newPow(x, n / 2) * newPow(x, n / 2);
        else return newPow(x, n / 2) * newPow(x, n / 2) * x;
    }

    public int[] searchRange(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int mid = low / 2 + high / 2;
        boolean targetFound = false;
        while (low < high) {
            mid = low / 2 + high / 2;
            if (nums[mid] == target) {
                targetFound = true;
                break;
            } else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        int[] ans = {-1, -1};
        if (!targetFound) return ans;

        int left = mid, right = mid;

        while (left > 0 && nums[left] == nums[mid]) left--;
        while (right < nums.length - 1 && nums[right] == nums[mid]) right++;


        ans[0] = left + 1;
        ans[1] = right - 1;

        return ans;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        while (count < n - 1 && nums[count] < nums[count + 1]) count++;

        count++;
        count %= n;

        int low = 0;
        int high = nums.length - 1;
        int mid = -1;

        if (target > nums[high]) high = count - 1;
        else low = count;

        while (high >= low) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }

        return mid;
    }

    public boolean isHappy(int n) {
        boolean flag = true;
        int a = 0, temp = n;
        while (a != 1) {
            a = temp;
            while (temp > 0) {
                a += (temp % 10) * (temp % 10);
                temp = temp / 10;
            }

            if (temp == n) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        //Calculating the length of the Linked List
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        //Optimising k
        k %= size;

        ListNode last = head;
        int count = 0;
        while (count < size - k) {
            last = last.next;
            count++;
        }
        while (last.next != null) {
            temp = last;
            while (temp.next != null)
                temp = temp.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }

    public int minOperations(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else
                freq.put(num, 1);
        }
        int count = 0;
        for (int val : freq.values()) {
            if (val == 1)
                return -1;
            else {
                int temp = val % 3;
                if (temp == 0) {
                    count += val / 3;
                } else {
                    count += val / 3 + 1;
                }
            }
        }
        return count;
    }

    public int lengthOfLIS(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        st.add(nums[0]);
        for (int num : nums) {
            int temp = st.peek();
            while (st.size() > 0 && num <= temp && isPresent(st, num)) {
                st.pop();
                if (st.size() > 0)
                    temp = st.peek();
            }
            st.push(num);
            max = Math.max(max, st.size());
        }
        return max;
    }

    private boolean isPresent(Stack<Integer> st, int num) {
        if (!st.contains(num))
            return true;
        return st.search(num) == 1;
    }

    public boolean closeStrings(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m != n)
            return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            int x = map1.getOrDefault(c, 0);
            map1.put(c, x + 1);
        }
        for (char c : word2.toCharArray()) {
            int x = map2.getOrDefault(c, 0);
            map2.put(c, x + 1);
        }

        if (!Arrays.equals(map1.keySet().toArray(new Character[0]), map2.keySet().toArray(new Character[0])))
            return false;

        int[] freq1 = map1.values().stream().mapToInt(Integer::intValue).toArray();
        int[] freq2 = map2.values().stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            int x = map.getOrDefault(winner, 0);
            int y = map.getOrDefault(loser, 0);
            map.put(winner, x);
            map.put(loser, y + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 0) {
                a.add(key);
            } else if (map.get(key) == 1)
                b.add(key);
        }
        sort(a);
        sort(b);

        ans.add(a);
        ans.add(b);
        return ans;
    }

    class RandomizedSet {
        Set<Integer> set;
        public RandomizedSet() {
            set = new HashSet<>();
        }

        public boolean insert(int val) {
            return set.add(val);
        }

        public boolean remove(int val) {
            return set.remove(val);
        }

        public int getRandom() {
            int n = set.size();
            int i = (int)Math.floor(Math.random()*n);
            return (int)set.toArray()[i];
        }
    }

    public int minimumCost(int[] nums) {
        List<Integer>minArray = new ArrayList<>();
        int[] index = new int[3];
        minArray.add(nums[0]);
        int min = Integer.MAX_VALUE;
        for( int i = 0 ; i < nums.length ; i++){
            if(minArray.contains(nums[i]) && index[0] == i)
                continue;
            if(min > nums[i]){
                min = nums[i];
                index[1] = i;
            }
        }
        minArray.add(min);
        min = Integer.MAX_VALUE;
        for( int i = 0 ; i < nums.length ; i++){
            if(minArray.contains(nums[i]) && (index[0]==i || index[1] == i))
                continue;
            if(min > nums[i]){
                min = nums[i];
                index[2] = i;
            }
        }
        minArray.add(min);
        return minArray.get(0)+ minArray.get(1)+minArray.get(2);
    }
    public  static int maxLength(List<String> arr) {
        int count = 0 , max = 0;

        for(int i = 0 ; i < arr.size() ; i++){
            count  = 0;
            boolean toContinue = true;
            int[] freq = new int [26];
            for(char c : arr.get(i).toCharArray()){
                if(freq[c-'a'] == 1)
                    toContinue = false;
                else
                    freq[c-'a']++;
            }
            if(toContinue){
                count = arr.get(i).length();
            }
            for(int j = 0; j < arr.size() && toContinue; j++){
                List<Character> curr = new ArrayList<>();
                boolean flag = true;
                if(j == i) continue;
                for(char c : arr.get(j).toCharArray()){
                    if(freq[c-'a'] == 1){
                        flag = false;
                        for(int k = 0 ; k < curr.size() ; k++)
                            freq[curr.get(k)-'a'] = 0;
                        break;
                    }
                    else{
                        freq[c-'a']++;
                        curr.add(c);
                    }
                }
                if(flag) count+= arr.get(j).length();
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        ans.add("a");
        ans.add("abc");
        ans.add("d");
        ans.add("de");
        ans.add("def");
        System.out.println(maxLength(ans));
    }
}