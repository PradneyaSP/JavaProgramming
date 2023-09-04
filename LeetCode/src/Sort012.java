public class Sort012 {

    public static void sort012(int[] a, int n) {
        // code here
        int[] countArr = {0,0,0};

        for(int i = 0 ; i < n ; i++)
            countArr[a[i]]++;

        int k = 0;
        for(int i = 0 ; i < 3 ; i++){
            while (countArr[i] > 0){
                a[k++] = i;
                countArr[i]--;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        int zeroPointer = 0;
        int nonZeroPointer = 1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[zeroPointer]==0){
                while(nums[nonZeroPointer]!= 0) {
                    nonZeroPointer++;
                    if (nonZeroPointer == nums.length)
                        return;
                }

                nums[zeroPointer] = nums[nonZeroPointer];
                nums[nonZeroPointer] = 0;
            }
            zeroPointer++;
            nonZeroPointer = zeroPointer+1;
        }
    }


    public static void main(String[] args) {

    }
}
