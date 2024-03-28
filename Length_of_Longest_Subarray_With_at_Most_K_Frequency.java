import java.util.*;
import java.io.*;
import java.lang.*;
public class Length_of_Longest_Subarray_With_at_Most_K_Frequency {
    class Solution {
        public int maxSubarrayLength(int[] nums, int k)
        {
            int n = nums.length;
            HashMap<Integer, Integer> hm = new HashMap<>();
            int max = 0;
            int l = 0;
            for (int r = 0 ; r < n ; r++)
            {
                hm.put(nums[r] , hm.getOrDefault(nums[r] , 0) + 1);
                while (hm.get(nums[r]) > k)
                {
                    hm.put(nums[l] , hm.get(nums[l]) - 1);
                    if(hm.get(nums[l]) == 0)
                    {
                        hm.remove(nums[l]);
                    }
                    l++;
                }
                int ans = r - l + 1;
                max = Math.max(max , ans);
            }
            return max;
        }
    }


// class Solution {
//     public int maxSubarrayLength(int[] nums, int k) {
//         HashMap<Integer , Integer> hm = new HashMap<>();
//         int n = nums.length;
//         int max = 0;
//         for(int i = 0 ; i<n ; i++)
//         {
//             int j;
//             for(j = i ; j<n ; j++)
//             {
//                 hm.put(nums[j] , hm.getOrDefault(nums[j] , 0) + 1);
//                 if(hm.get(nums[j]) > k)
//                 {
//                     break;
//                 }
//             }
//             int ans = j-i;
//             if(ans>max)
//             {
//                 max = ans;
//             }
//             hm.clear();
//         }
//         return max;
//     }
// }
}
