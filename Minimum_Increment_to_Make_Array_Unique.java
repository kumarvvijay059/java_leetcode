import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Increment_to_Make_Array_Unique {
    class Solution {
        public int minIncrementForUnique(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int numt = 0;
            int min = 0;
            for(int num : nums)
            {
                numt = Math.max(numt , num);
                min += numt - num;
                numt += 1;
            }
            return min;
        }
    }
}
