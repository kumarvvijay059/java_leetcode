import java.util.*;
import java.io.*;
import java.lang.*;
public class Product_of_Array_Except_Self {
    class Solution {
        public int[] productExceptSelf(int[] nums)
        {
            int n = nums.length;
            int[] ans = new int[n];
            int product = 1;
            ans[0] = nums[0];
            for(int i = 1 ; i<n ; i++)
            {
                ans[i] = ans[i-1] * nums[i];
            }
            for(int i = n-1 ; i>=0 ; i--)
            {
                if(i!=0)
                {
                    if(i == n-1)
                    {
                        ans[i] = ans[i - 1];
                    }
                    else
                    {
                        ans[i] = ans[i-1] * product;
                    }
                    product = product * nums[i];
                }
                else
                {
                    ans[i] = product;
                }
            }
            return ans;
        }
    }
}
