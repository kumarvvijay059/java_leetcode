import java.util.*;
import java.io.*;
import java.lang.*;
public class Contiguous_Array {
    class Solution {
        public int findMaxLength(int[] nums) {
            int n = nums.length;
            HashMap<Integer , Integer> hm = new HashMap<>();//difference index
            int count_0 = 0;
            int count_1 = 0;
            int max = 0;
            hm.put(0,-1);
            for(int i = 0 ; i<n ; i++)
            {
                if(nums[i]==0)
                {
                    count_0++;
                }
                else
                {
                    count_1++;
                }
                int diff = count_0 - count_1;
                if(hm.containsKey(diff))
                {
                    int p_ind = hm.get(diff);
                    int len = i - p_ind;
                    max = Math.max(max, len);
                }
                else
                {
                    hm.put(diff , i);
                }
            }
            return max;
        }
    }


// class Solution {
//     public int findMaxLength(int[] nums) {
//         int n = nums.length;
//         int max = 0;
//         for(int i = 0 ; i<n ; i++)
//         {
//             int count_0 = 0;
//             int count_1 = 0;
//             for(int j = i ; j<n ; j++)
//             {
//                 int ans = 0;
//                 if(nums[j]==0)
//                 {
//                     count_0++;
//                 }
//                 else
//                 {
//                     count_1++;
//                 }
//                 if(count_1==count_0)
//                 {
//                     ans = j-i+1;
//                 }
//                 if(max<ans)
//                 {
//                     max = ans;
//                 }
//             }
//         }
//         return max;
//     }
// }
}
