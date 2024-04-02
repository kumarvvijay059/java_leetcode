import java.util.*;
import java.io.*;
import java.lang.*;
public class Isomorphic_Strings {
    class Solution {
        public boolean isIsomorphic(String s, String t)
        {
            int n = s.length();
            HashMap<Character , Character> hm = new HashMap<>();
            for(int i = 0 ; i<n ; i++)
            {
                if(!hm.containsKey(s.charAt(i)))
                {
                    if(hm.containsValue(t.charAt(i)))
                    {
                        return false;
                    }
                    hm.put(s.charAt(i) , t.charAt(i));
                }
                else
                {
                    if(hm.get(s.charAt(i)) != t.charAt(i))
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}

