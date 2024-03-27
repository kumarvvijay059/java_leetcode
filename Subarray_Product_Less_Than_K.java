import java.util.*;
import java.io.*;
import java.lang.*;
public class Subarray_Product_Less_Than_K {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k)
        {
            int sum = 1;
            int result = 0;
            int left = 0;

            for(int right = 0; right < nums.length; right++)
            {
                sum *= nums[right];
                while(sum >= k && left <= right)
                {
                    sum /= nums[left];
                    left++;
                }
                result += right - left + 1;
            }

            return result;
        }
    }


// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         int n = nums.length;
//         int ans = 0;
//         for (int i = 0; i < n; i++)
//         {
//             int prod = 1;
//             for(int j = i ; j<n ; j++)
//             {
//                 prod = prod * nums[j];
//                 if (prod < k)
//                 {
//                     ans = ans + 1;
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }

//         }
//         return ans;
//     }
// }




// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         int n = nums.length;
//         int ans = 0;
//         for (int i = 0; i < n; i++)
//         {
//             int a = fun(1, i, nums, k);
//             ans = ans + a;
//         }
//         return ans;
//     }

//     public int fun(int prod, int ind, int[] nums, int k)
//     {
//         if (ind >= nums.length)
//         {
//             return 0;
//         }
//         prod = prod * nums[ind];
//         if (prod < k)
//         {
//             return 1 + fun(prod, ind + 1, nums, k);
//         }
//         return 0;
//     }
// }



}
