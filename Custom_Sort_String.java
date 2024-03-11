import java.util.*;
import java.io.*;
import java.lang.*;
public class Custom_Sort_String {
    class Solution {
        public String customSortString(String order, String s) {
            HashMap<Character , Integer> hm = new HashMap<>();
            for(int i = 0 ; i<s.length() ; i++)
            {
                hm.put(s.charAt(i) , hm.getOrDefault(s.charAt(i) , 0) + 1);
            }
            String ans = "";
            for(int i = 0 ; i<order.length() ; i++)
            {
                if(hm.containsKey(order.charAt(i)))
                {
                    int x = hm.get(order.charAt(i));
                    while(x>0)
                    {
                        ans = ans + order.charAt(i);
                        x--;
                    }
                    hm.remove(order.charAt(i));
                }
            }
            Iterator hmi = hm.entrySet().iterator();
            while(hmi.hasNext())
            {
                Map.Entry map = (Map.Entry)hmi.next();
                char c = (char)map.getKey();
                int m = (int)map.getValue();
                while(m>0)
                {
                    ans = ans + c;
                    m--;
                }
            }
            return ans;
        }
    }
}
