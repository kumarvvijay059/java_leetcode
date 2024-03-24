import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_the_Duplicate_Number {
    class Solution {
        public int findDuplicate(int[] nums) {
            Arrays.sort(nums);
            int temp = 0;
            for(int ele : nums)
            {
                if(ele == temp)
                {
                    return ele;
                }
                temp = ele;
            }
            return 0;
        }
    }
}
