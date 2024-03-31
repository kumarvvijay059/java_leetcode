import java.util.*;
import java.io.*;
import java.lang.*;
public class Count_Subarrays_With_Fixed_Bounds {
    class Solution {
        public long countSubarrays(int[] nums, int minK, int maxK) {
            int n = nums.length;
            long ans = 0;
            int left = 0;
            int count = 0;
            int maxI = -1;
            int minI = -1;
            for(int right = 0 ; right<n ; right++)
            {
                if(nums[right] == minK)
                {
                    minI = right;
                }
                if(nums[right] == maxK)
                {
                    maxI = right;
                }
                if(nums[right]>maxK || nums[right]<minK)
                {
                    left = right + 1;
                }
                if(minI == -1 || maxI == -1)
                {
                    continue;
                }
                count = Math.min(maxI , minI) - left + 1;
                if(count<0)
                {
                    count = 0;
                }
                ans = ans + count;
            }
            return ans;
        }
    }




}
