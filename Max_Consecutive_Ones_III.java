import java.util.*;
public class Max_Consecutive_Ones_III {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int n = nums.length;
            int l = 0;
            int r = 0;
            int maxlen = 0;
            int count0 = 0;
            while(r<n)
            {
                if(nums[r] == 0)
                {
                    count0++;
                }
                while(count0 > k)
                {
                    if(nums[l] == 0)
                    {
                        count0--;
                    }
                    l++;
                }
                if(count0 <= k)
                {
                    maxlen = Math.max(maxlen , r-l+1);
                }
                r++;
            }
            return maxlen;
        }
    }
}
