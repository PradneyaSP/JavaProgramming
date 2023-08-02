public class A_BinarySearch {
    /*      Iterative Binary Search
            Time Complexity : O(logn)
            Space Complexity: O(1)

            Recursive Binary Search
            Time Complexity : O(logn)
            Space Complexity: 0(logn)
    */
    static boolean binarySearch(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] > target) end = mid - 1;
            else st = mid + 1;
        }

        return false;
    }

    static boolean recBinarySearch(int[] arr, int target, int st, int end) {
        if (st > end) return false;

        int mid = st + (end - st) / 2;
        ;
        if (arr[mid] == target) return true;
        else if (arr[mid] > target)
            return recBinarySearch(arr, target, st, mid - 1);
        else
            return recBinarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 12, 14, 19, 25};
        int target = 12;

        System.out.println(binarySearch(arr, target));
        System.out.println(recBinarySearch(arr, target, 0, arr.length - 1));
    }
}
