import java.util.*;
import java.io.*;
import java.lang.*;
public class Majority_Element {
    class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            HashMap<Integer , Integer> hm = new HashMap<>();
            for(int e : nums)
            {
                if(hm.containsKey(e))
                {
                    hm.put(e , hm.get(e) + 1);
                }
                else
                {
                    hm.put(e , 1);
                }
            }
            for(int e : hm.keySet())
            {
                if(hm.get(e)>n/2)
                {
                    return e;
                }
            }
            return 0;
        }
    }
}
