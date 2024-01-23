import java.io.*;
import java.util.*;
import java.lang.*;
public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {
    class Solution {
        public int maxLength(List<String> arr)
        {
            String temp = "";
            return fun(0, arr, temp);
        }

        public static int fun(int index, List<String> arr, String temp)
        {
            if(index >= arr.size())
            {
                return temp.length();
            }

            int inc = 0;
            int exc;

            if(isUnique(temp, arr.get(index)))
            {
                exc = fun(index + 1, arr, temp);
                inc = fun(index + 1, arr, temp + arr.get(index));
            }
            else
            {
                exc = fun(index + 1, arr, temp);
            }

            return Math.max(inc, exc);
        }

        public static boolean isUnique(String s1 , String s2)
        {
            String s = s1 + s2;
            HashSet<Character> hs = new HashSet<>();

            for(int i = 0; i < s.length(); i++)
            {
                if(hs.contains(s.charAt(i)))
                {
                    return false;
                }
                else
                {
                    hs.add(s.charAt(i));
                }
            }

            return true;
        }
    }
}

