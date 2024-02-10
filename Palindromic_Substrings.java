import java.util.*;
import java.io.*;
import java.lang.*;
public class Palindromic_Substrings {
    // class Solution {
//     public int countSubstrings(String s) {
//         int n = s.length();
//         int count = 0;
//         for(int i = 0 ; i<n ; i++)
//         {
//             for(int j = i ; j<n ; j++)
//             {
//                 if(isPalindrome(s.substring(i , j+1)))
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     public static boolean isPalindrome(String s)
//     {
//         for(int i = 0 ; i<s.length()/2 ; i++)
//         {
//             if(s.charAt(i) != s.charAt(s.length() - i - 1))
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

    class Solution {
        public int countSubstrings(String s) {
            int n = s.length();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += isPalindrome(i, i, s) + isPalindrome(i, i + 1, s);
            }
            return ans;
        }

        public int isPalindrome(int l, int r, String s) {
            int count = 0, n = s.length();
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                count++;
                l--;
                r++;
            }
            return count;
        }
    }
}
