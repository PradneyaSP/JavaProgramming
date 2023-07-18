import java.util.Arrays;

public class J_SortingProblem2 {

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static void partition(int[] arr) {

        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] < 0)
                left++;
            while (arr[right] >= 0)
                right--;
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,-2,4,5,-23,-23 ,0, 6 ,3};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }
}
