import java.util.*;
import java.io.*;
import java.lang.*;
public class Subarray_Sums_Divisible_by_K {
    class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            int n = nums.length;
            int count = 0;
            HashMap<Integer , Integer> hm = new HashMap<>();
            hm.put(0 , 1);
            int sum = 0;
            for(int i = 0 ; i<n ; i++)
            {
                sum = sum + nums[i];
                int r = sum%k;
                if(r<0)
                {
                    r = r + k;
                }
                if(hm.containsKey(r))
                {
                    count = count + hm.get(r);
                    hm.put(r , hm.get(r) + 1);
                }
                else
                {
                    hm.put(r , 1);
                }
            }
            return count;
        }
    }


// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         int n = nums.length;
//         int count = 0;
//         for(int i = 0 ; i<n ; i++)
//         {
//             int sum = 0;
//             for(int j = i ; j<n ; j++)
//             {
//                 sum = sum + nums[j];
//                 if(sum%k == 0)
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
}
