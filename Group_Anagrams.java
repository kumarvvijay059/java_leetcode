import java.util.*;
import java.io.*;
import java.lang.*;
public class Group_Anagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            int n = strs.length;
            Map<String , List<String>> mp = new HashMap<>();
            for(String s : strs)
            {
                char arr[] = s.toCharArray();
                Arrays.sort(arr);
                String sorted = new String(arr);
                if(!mp.containsKey(sorted))
                {
                    mp.put(sorted , new LinkedList<String>());
                }
                mp.get(sorted).add(s);
            }
            return new LinkedList<>(mp.values());
        }
    }
}
