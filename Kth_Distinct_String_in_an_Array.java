import java.util.*;
public class Kth_Distinct_String_in_an_Array {
    class Solution {
        public String kthDistinct(String[] arr, int k) {
            // int n = arr.length;
            HashMap<String , Integer> hm = new HashMap<>();
            for(String s : arr)
            {
                hm.put(s , hm.getOrDefault(s , 0) + 1);
            }
            int cnt = 0;
            for(String s : arr)
            {
                if(hm.get(s) == 1)
                {
                    cnt++;
                    if(cnt == k)
                    {
                        return s;
                    }
                }
            }
            return "";
        }
    }
}
