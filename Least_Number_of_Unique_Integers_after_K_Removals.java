import java.util.*;
import java.io.*;
import java.lang.*;
public class Least_Number_of_Unique_Integers_after_K_Removals {
    class Solution {
        public int findLeastNumOfUniqueInts(int[] arr, int k) {
            HashMap<Integer , Integer> hs = new HashMap<>();
            for(int e : arr)
            {
                hs.put(e , hs.getOrDefault(e , 0) + 1);
            }
            PriorityQueue<Map.Entry<Integer , Integer>> prq = new PriorityQueue<>(
                    (a , b) -> a.getValue() - b.getValue()
            );
            prq.addAll(hs.entrySet());
            while(k>0)
            {
                Map.Entry<Integer , Integer> entry = prq.poll();
                if(entry.getValue()<=k)
                {
                    k = k - entry.getValue();
                }
                else
                {
                    // return prq.size() + 1;
                    prq.add(entry);
                    k = 0;
                }
            }
            return prq.size();
        }
    }
}
