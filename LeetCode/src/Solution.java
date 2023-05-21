class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        search:{
            for(int i =0 ; i<nums.length ; i++){
                for(int j=i+1 ; j < nums.length ;j++){
                    if(nums[i]==nums[j])
                        flag = false;
                }
            }
        }
    }
}