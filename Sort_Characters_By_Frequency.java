import java.util.*;
import java.io.*;
import java.lang.*;
public class Sort_Characters_By_Frequency {
    class Solution {
        public String frequencySort(String s) {
            Map<Character, Integer> mapp = new HashMap<>();

            for (char c : s.toCharArray()) {
                mapp.put(c, mapp.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Map.Entry<Character, Integer>> prq = new PriorityQueue<>(
                    (a, b) -> b.getValue() - a.getValue()
            );

            prq.addAll(mapp.entrySet());

            StringBuilder result = new StringBuilder();
            while (!prq.isEmpty()) {
                Map.Entry<Character, Integer> entry = prq.poll();
                result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
            }

            return result.toString();
        }
    }


}
