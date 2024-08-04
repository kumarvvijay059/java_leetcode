import java.util.*;
public class Range_Sum_of_Sorted_Subarray_Sums {
    class Solution {
        public int rangeSum(int[] nums, int n, int left, int right) {
            int mod = 1000000000+7;
            int[] arr = new int[n*(n+1)/2];
            int ind = 0;
            for(int i = 0 ; i<n ; i++)
            {
                int sum = 0;
                for(int j = i ; j<n ; j++)
                {
                    sum = (sum + nums[j])%mod;
                    arr[ind] = sum;
                    ind++;
                }
            }
            Arrays.sort(arr);
            int ans = 0;
            for(int i = left - 1 ; i<=right - 1 ; i++)
            {
                ans = (ans + arr[i])%mod;
            }
            return ans%mod;
        }
    }
}
