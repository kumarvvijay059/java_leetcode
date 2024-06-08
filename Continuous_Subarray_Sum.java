import java.util.*;
import java.io.*;
import java.lang.*;
public class Continuous_Subarray_Sum {
    class Solution {
        public boolean checkSubarraySum(int[] nums, int k) {
            int n = nums.length;
            HashMap<Integer , Integer> remMap = new HashMap<>();
            remMap.put(0 , -1);
            int sum = 0;
            for(int i = 0 ; i<n ; i++)
            {
                sum = sum + nums[i];
                int rem = sum % k;
                if(rem<0)
                {
                    rem = rem + k;
                }
                if(remMap.containsKey(rem))
                {
                    if(i - remMap.get(rem) >= 2)
                    {
                        return true;
                    }
                }
                else
                {
                    remMap.put(rem , i);
                }
            }
            return false;
        }
    }


// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         for(int st = 0 ; st<n-1 ; st++)
//         {
//             for(int end = st+1 ; end<n ; end++)
//             {
//                 int sum = 0;
//                 for(int i = st ; i<=end ; i++)
//                 {
//                     sum = sum + nums[i];
//                 }
//                 if(sum%k==0)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
}
