import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        for(int i = s.length()-1 ; i>= 0 ; i--){
            if(s.charAt(i) == ' ')
                break;
            else
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}