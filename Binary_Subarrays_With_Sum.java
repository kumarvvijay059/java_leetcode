import java.util.*;
import java.io.*;
import java.lang.*;
public class Binary_Subarrays_With_Sum {
    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int n = nums.length;
            int count = 0;
            int left1 = 0, left2 = 0;
            int sum1 = 0, sum2 = 0;

            for (int right = 0; right < n; right++) {
                sum1 += nums[right];
                while (left1 <= right && sum1 > goal) {
                    sum1 -= nums[left1++];
                }

                sum2 += nums[right];
                while (left2 <= right && sum2 >= goal) {
                    sum2 -= nums[left2++];
                }

                count += left2 - left1;
            }
            return count;
        }
    }

// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int currSum=0;
//             for(int j=i;j<nums.length;j++){
//                 currSum+=nums[j];
//                 if(currSum==goal){
//                     count++;

//                 }
//                 else if(currSum > goal) break;
//             }
//         }
//         return count;
//     }
// }


    // class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         int ans = 0;
//         int n = nums.length;
//         for(int i = 0 ; i<n ; i++)
//         {
//             ans += fun(i , 0 , nums , goal);
//         }
//         return ans;
//     }

//     public static int fun(int index , int sum , int[] nums , int goal)
//     {
//         if(index>=nums.length)
//         {
//             return 0;
//         }
//         if(sum + nums[index] == goal)
//         {
//             return 1 + fun(index+1 , sum+nums[index] , nums , goal);
//         }
//         else if(sum + nums[index] < goal)
//         {
//             return fun(index+1 , sum+nums[index] , nums , goal);
//         }
//         return 0;
//     }
// }

}
