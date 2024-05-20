import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_of_All_Subset_XOR_Totals {
    class Solution {
        public int subsetXORSum(int[] nums)
        {
            return subsetXORSumHelper(nums, 0, 0);
        }

        private int subsetXORSumHelper(int[] nums, int index, int currentXOR)
        {
            if (index == nums.length)
            {
                return currentXOR;
            }
            int includeCurrent = subsetXORSumHelper(nums, index + 1, currentXOR ^ nums[index]);
            int excludeCurrent = subsetXORSumHelper(nums, index + 1, currentXOR);
            return includeCurrent + excludeCurrent;
        }
    }

}
