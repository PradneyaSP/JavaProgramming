public class W_MinSwapsToMakeSubsequencesIncreasing {
    public int minSwap(int[] nums1, int[] nums2) {
        return helperRec(nums1, nums2, 1);
    }

    public int helperRec(int[] nums1, int[] nums2, int i) {
        int n = nums1.length;
        if (i >= n - 1) return 0;
        if (nums1[i] - nums1[i - 1] > 0 && nums2[i] - nums2[i - 1] > 0) return helperRec(nums1, nums2, i + 1);
        if (nums1[i] - nums1[i - 1] <= 0 || nums2[i] - nums2[i - 1] <= 0) {
            int temp = nums1[i + 1];
            nums1[i + 1] = nums2[i + 1];
            nums2[i + 1] = temp;
            return 1 + helperRec(nums1, nums2, i + 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 4};
        int[] nums2 = {1, 2, 3, 7};
        W_MinSwapsToMakeSubsequencesIncreasing s = new W_MinSwapsToMakeSubsequencesIncreasing();
        System.out.println(s.minSwap(nums1, nums2));
    }
}
