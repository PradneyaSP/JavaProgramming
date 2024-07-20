package DP;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HouseRobber {

    public static int numberOfFishCaught(int[] nums) {
        int fish = 0;
        int nofish = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = nofish + nums[i];
            int newNoRob = Math.max(nofish, fish);
            fish = newRob;
            nofish = newNoRob;
        }
        return Math.max(fish, nofish);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] numberOfFishInEachPond = new int [n];
            for(int i = 0 ; i < n ;  i++)
                numberOfFishInEachPond[i] = sc.nextInt();

            int ans = numberOfFishCaught(numberOfFishInEachPond);
            System.out.println(ans);
            t--;
        }
    }
}