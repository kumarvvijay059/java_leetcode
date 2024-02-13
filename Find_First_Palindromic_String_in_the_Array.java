import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_First_Palindromic_String_in_the_Array {
    class Solution {
        public String firstPalindrome(String[] words) {
            for(String s : words)
            {
                if(isPalindrome(s))
                {
                    return s;
                }
            }
            return "";
        }

        public static boolean isPalindrome(String s)
        {
            int n = s.length();
            for(int i = 0 ; i<n ; i++)
            {
                if(s.charAt(i) != s.charAt(n-1-i))
                {
                    return false;
                }
            }
            return true;
        }
    }
}
