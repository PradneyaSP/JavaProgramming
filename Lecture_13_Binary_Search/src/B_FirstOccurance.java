public class B_FirstOccurance {
    static int firstOccurance(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int fo = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                fo = mid;
                end = mid - 1;
            }
            else if (target < arr[mid]) end = mid - 1;
            else st = mid + 1;
        }

        return fo;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 6, 8, 9, 9, 9};
        int target = 5;

        System.out.println(firstOccurance(arr, target));
    }
}
