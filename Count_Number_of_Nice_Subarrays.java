import java.util.*;
import java.io.*;
import java.lang.*;
public class Count_Number_of_Nice_Subarrays {
    class Solution {
        public int numberOfSubarrays(int[] nums, int k) {
            int n = nums.length;
            int ans = 0;
            for(int i = 0 ; i<n ; i++)
            {
                nums[i] = nums[i] % 2;
            }
            int[] prefix = new int[n+1];
            prefix[0] = 1;
            int sum = 0;
            for(int e : nums)
            {
                sum = sum + e;
                if(sum>=k)
                {
                    ans = ans + prefix[sum - k];
                }
                prefix[sum]++;
            }
            return ans;
        }
    }

// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int n = nums.length;
//         int ans = 0;
//         for(int st = 0 ; st<n ; st++)
//         {
//             for(int end = st ; end<n ; end++)
//             {
//                 int count = 0;
//                 for(int i = st ; i<=end ; i++)
//                 {
//                     if(nums[i]%2 != 0)
//                     {
//                         count++;
//                     }
//                 }
//                 if(count == k)
//                 {
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
// }
}
