import java.util.*;
import java.io.*;
import java.lang.*;
public class Length_of_Last_Word {
    class Solution {
        public int lengthOfLastWord(String s)
        {
            int n = s.length();
            int count = 0;
            int temp = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(s.charAt(i) == ' ')
                {
                    count = 0;
                }
                else
                {
                    count++;
                    temp = count;
                }
            }
            if(count == 0)
            {
                return temp;
            }
            return count;
        }
    }
}
