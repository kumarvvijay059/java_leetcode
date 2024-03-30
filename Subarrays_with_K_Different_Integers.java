import java.util.*;
import java.io.*;
import java.lang.*;
public class Subarrays_with_K_Different_Integers {
    class Solution {
        public int subarraysWithKDistinct(int[] nums, int k)
        {
            int subArrk = subarrayWithAtMostK(nums, k);
            int subArrK_1 = subarrayWithAtMostK(nums, k - 1);
            return subArrk - subArrK_1;
        }

        public int subarrayWithAtMostK(int[] nums, int k)
        {
            int n = nums.length;
            HashMap<Integer, Integer> hm = new HashMap<>();
            int left = 0;
            int right = 0;
            int count = 0;
            while (right<n)
            {
                hm.put(nums[right], hm.getOrDefault(nums[right], 0) + 1);
                while (hm.size() > k)
                {
                    hm.put(nums[left], hm.get(nums[left]) - 1);
                    if(hm.get(nums[left]) == 0)
                    {
                        hm.remove(nums[left]);
                    }
                    left++;
                }
                count += right - left + 1;
                right++;
            }
            return count;
        }
    }


}
