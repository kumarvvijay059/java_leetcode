import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_Polygon_With_the_Largest_Perimeter {
    class Solution {
        public long largestPerimeter(int[] nums) {
            return fun(nums);
        }

        public static long fun(int[] nums)
        {
            int n = nums.length;
            int count = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(nums[i]>0)
                {
                    count++;
                }
            }
            if(count<3)
            {
                return -1;
            }
            long max = 0;
            long pm = 0;
            int maxind = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(max<nums[i])
                {
                    max = nums[i];
                    maxind = i;
                }
                pm = pm + nums[i];
            }
            if(pm - max > max)
            {
                return pm;
            }
            else
            {
                nums[maxind] = 0;
                return fun(nums);
            }
        }
    }
}
