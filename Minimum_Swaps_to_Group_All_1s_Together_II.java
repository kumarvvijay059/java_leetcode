import java.util.*;
public class Minimum_Swaps_to_Group_All_1s_Together_II {
    class Solution {
        public int minSwaps(int[] nums) {
            int n = nums.length;
            int count_1 = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(nums[i] == 1)
                {
                    count_1++;
                }
            }
            int count_0 = 0;
            for(int i = 0 ; i<count_1 ; i++)
            {
                if(nums[i] == 0)
                {
                    count_0++;
                }
            }
            int min = count_0;
            for(int i = count_1 ; i<n + count_1 ; i++)
            {
                if(nums[i%n] == 0)
                {
                    count_0++;
                }
                if(nums[(i-count_1+n)%n] == 0)
                {
                    count_0--;
                }
                min = Math.min(min , count_0);
            }
            return min;
        }
    }
}
