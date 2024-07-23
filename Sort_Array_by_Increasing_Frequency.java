import java.util.*;
import java.io.*;
import java.lang.*;
public class Sort_Array_by_Increasing_Frequency {
    class Solution {
        public int[] frequencySort(int[] nums) {
            int n = nums.length;
            Integer[] num = new Integer[n];
            HashMap<Integer , Integer> hm = new HashMap<>();
            for(int i = 0 ; i<n ; i++)
            {
                num[i] = nums[i];
                hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
            }

            Arrays.sort(num , (a , b) -> {
                if(hm.get(a) == hm.get(b))
                {
                    return b - a;
                }
                else
                {
                    return hm.get(a) - hm.get(b);
                }
            });

            for(int i = 0 ; i<n ; i++)
            {
                nums[i] = num[i];
            }
            return nums;
        }
    }
}
