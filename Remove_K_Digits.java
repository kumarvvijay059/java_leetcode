import java.util.*;
import java.io.*;
import java.lang.*;
public class Remove_K_Digits {
    class Solution {
        public String removeKdigits(String num, int k)
        {
            int n = num.length();
            Stack<Integer> s = new Stack<>();
            for(int i = 0 ; i<n ; i++)
            {
                int e = num.charAt(i) - '0';
                while(!s.isEmpty() && s.peek() > e && k > 0)
                {
                    s.pop();
                    k--;
                }
                s.push(e);
            }
            while(k > 0 && !s.isEmpty())
            {
                s.pop();
                k--;
            }
            StringBuilder sb = new StringBuilder();
            while(!s.isEmpty())
            {
                sb.insert(0 , String.valueOf(s.pop()));
            }
            while(sb.length() > 1 && sb.charAt(0) == '0')
            {
                sb.deleteCharAt(0);
            }
            return sb.length() == 0 ? "0" : sb.toString();
        }
    }

}
