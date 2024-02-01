import java.util.*;
import java.lang.*;
import java.io.*;
public class Divide_Array_Into_Arrays_With_Max_Difference {
    class Solution {
        public int[][] divideArray(int[] nums, int k) {
            int n = nums.length;
            int[][] ans = new int[n/3][3];
            int[][] ans1 = {};
            Arrays.sort(nums);
            int left , middle , right;
            int a = 0;
            for(int i = 0 ; i<=n-3 ; i = i + 3)
            {
                left = nums[i];
                middle = nums[i+1];
                right = nums[i+2];
                if(right - left <= k)
                {
                    ans[a][0] = left;
                    ans[a][1] = middle;
                    ans[a][2] = right;
                    a++;
                }
                else
                {
                    return ans1;
                }
            }
            return ans;
        }
    }
}
