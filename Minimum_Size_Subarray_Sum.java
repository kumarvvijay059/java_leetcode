import java.util.*;
public class Minimum_Size_Subarray_Sum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int n = nums.length;
            int sum = 0;
            int minlen = n;
            int l = 0;
            int r = -1;

            for(int i = 0 ; i<n ; i++)
            {
                sum = sum + nums[i];
            }
            if(sum<target)
            {
                return 0;
            }

            sum = 0;
            while(l<n)
            {
                while(sum < target && r < n-1)
                {
                    sum = sum + nums[r+1];
                    r++;
                }
                if(sum >= target)
                {
                    minlen = Math.min(minlen , r-l+1);
                }
                sum = sum - nums[l];
                l++;
            }
            return minlen;
        }
    }
}
