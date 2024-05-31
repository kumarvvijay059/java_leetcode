import java.util.*;
import java.io.*;
import java.lang.*;
public class Single_Number_III {
    class Solution {
        public int[] singleNumber(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2];
            int ind = 0;
            for(int i = 0 ; i<n ; i++)
            {
                boolean found = false;
                for(int j = 0 ; j<n ; j++)
                {
                    if(i!=j)
                    {
                        if(nums[i] == nums[j])
                        {
                            found = true;
                            break;
                        }
                    }
                }
                if(found == false)
                {
                    ans[ind] = nums[i];
                    ind++;
                    if(ind == 2)
                    {
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
