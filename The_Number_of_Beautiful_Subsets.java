import java.util.*;
import java.lang.*;
import java.io.*;
public class The_Number_of_Beautiful_Subsets {
    class Solution {
        List<List<Integer>> al1 = new ArrayList<>();

        public int beautifulSubsets(int[] nums, int k)
        {
            Arrays.sort(nums);
            subSet(nums, 0, k, new ArrayList<>());
            return al1.size();
        }

        public void subSet(int[] nums, int ind, int k, List<Integer> al2)
        {
            if(ind >= nums.length)
            {
                if(al2.size() > 0)
                {
                    al1.add(al2);
                }
                return;
            }
            if(!al2.contains(nums[ind] - k))
            {
                al2.add(nums[ind]);
                subSet(nums, ind + 1, k, al2);
                al2.remove(al2.size() - 1);
            }
            subSet(nums, ind + 1, k, al2);
        }
    }
}
