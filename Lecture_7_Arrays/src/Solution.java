package src;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int [2*n];
        int k = 0;
        for(int i = 0 ; i <n ; i++){
            if(i%2==0)
                ans[i]=nums[i];
            else
                ans[i]=nums[n+i-1];
        }
        nums = ans;
        return nums;
    }

    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int []leftsum = new int[n];
        int []rightsum = new int[n];
        int []answer = new int[n];
        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++ )
                leftsum[i]+=nums[j];
            for (int j = i+1 ; j < n ; j++ )
                rightsum[i]+=nums[j];
        }

        for(int i = 0 ; i < n ; i++ )
            answer[i] = abs(leftsum[i]-rightsum[i]);

        return answer;
    }

    public static void main(String[] args) {

    }
}
