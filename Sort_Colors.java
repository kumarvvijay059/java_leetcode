import java.util.*;
import java.io.*;
import java.lang.*;
public class Sort_Colors {
    class Solution {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int ct0 = 0;
            int ct1 = 0;
            int ct2 = 0;
            for(int c : nums)
            {
                if(c == 0)
                {
                    ct0++;
                }
                else if(c == 1)
                {
                    ct1++;
                }
                else
                {
                    ct2++;
                }
            }
            int i = 0;
            for(; i<ct0 ; i++)
            {
                nums[i] = 0;
            }
            for(; i<ct1+ct0 ; i++)
            {
                nums[i] = 1;
            }
            for(; i<ct2+ct0+ct1 ; i++)
            {
                nums[i] = 2;
            }
        }
    }
}
