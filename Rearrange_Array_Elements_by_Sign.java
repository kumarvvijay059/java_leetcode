import java.util.*;
import java.io.*;
import java.lang.*;
public class Rearrange_Array_Elements_by_Sign {
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            int posind = 0;
            int negind = 1;
            for(int i = 0 ; i<n ; i++)
            {
                if(nums[i]>0)
                {
                    ans[posind] = nums[i];
                    posind = posind + 2;
                }
                else
                {
                    ans[negind] = nums[i];
                    negind = negind + 2;
                }
            }
            return ans;
        }
    }

// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();
//         for(int i = 0 ; i<n ; i++)
//         {
//             if(nums[i]>0)
//             {
//                 pos.add(nums[i]);
//             }
//             else
//             {
//                 neg.add(nums[i]);
//             }
//         }
//         for(int i = 0 ; i<n ; i++)
//         {
//             if(i%2 == 0)
//             {
//                 nums[i] = pos.get(i/2);
//             }
//             else
//             {
//                 nums[i] = neg.get(i/2);
//             }
//         }
//         return nums;
//     }
// }



}
