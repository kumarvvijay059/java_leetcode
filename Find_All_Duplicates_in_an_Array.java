import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_All_Duplicates_in_an_Array {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> al = new ArrayList<>();
            Arrays.sort(nums);
            int temp = 0;
            for(int ele : nums)
            {
                if(ele == temp)
                {
                    al.add(ele);
                }
                temp = ele;
            }
            return al;
        }
    }
}
