import java.util.*;
public class Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves {
    class Solution {
        public int minDifference(int[] nums)
        {
            int n = nums.length;
            if(n <= 4)
            {
                return 0;
            }
            Arrays.sort(nums);
            int ans = Integer.MAX_VALUE;
            for(int i = 1 ; i<=4 ; i++)
            {
                int diff = Math.abs(nums[n-i] - nums[4-i]);
                if(diff<ans)
                {
                    ans = diff;
                }
            }
            return ans;
        }
    }
}
