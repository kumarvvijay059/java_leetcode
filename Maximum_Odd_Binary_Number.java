import java.util.*;
import java.io.*;
import java.lang.*;
public class Maximum_Odd_Binary_Number {
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            int count1 = 0;
            int n = s.length();
            for(int i = 0 ; i<n ; i++)
            {
                if(s.charAt(i)=='1')
                {
                    count1++;
                }
            }
            String ans = "";
            count1--;
            for(int i = 0 ; i<n-1 ; i++)
            {
                if(count1>0)
                {
                    ans = ans + "1";
                    count1--;
                }
                else
                {
                    ans = ans + "0";
                }
            }
            ans = ans + "1";
            return ans;

        }
    }
}
