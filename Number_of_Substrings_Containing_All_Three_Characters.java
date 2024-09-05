import java.util.*;
public class Number_of_Substrings_Containing_All_Three_Characters {
    class Solution {
        public int numberOfSubstrings(String s) {
            int n = s.length();
            int[] alpha = {-1 , -1 , -1};
            int num = 0;
            for(int i = 0 ; i<n ; i++)
            {
                alpha[s.charAt(i)-'a'] = i;
                if(alpha[0] != -1 && alpha[1] != -1 && alpha[2] != -1)
                {
                    int min = Math.min(alpha[0] , Math.min(alpha[1] , alpha[2]));
                    num = num + min + 1;
                }
            }
            return num;
        }
    }
}
