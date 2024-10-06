public class Permutation_in_String {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int n = s1.length();
            int m = s2.length();
            if(n>m)
            {
                return false;
            }

            int[] h1 = new int[26];
            int[] h2 = new int[26];

            for(int i = 0 ; i<s1.length() ; i++)
            {
                h1[s1.charAt(i) - 'a']++;
                h2[s2.charAt(i) - 'a']++;
            }

            for(int i = 0 ; i<=m-n ; i++)
            {
                if(check(h1 , h2))
                {
                    return true;
                }
                if(i+n<m)
                {
                    h2[s2.charAt(i)-'a']--;
                    h2[s2.charAt(i+n)-'a']++;
                }
            }
            return false;

        }

        private static boolean check(int[] h1 , int[] h2)
        {
            for(int i = 0 ; i<26 ; i++)
            {
                if(h1[i] != h2[i])
                {
                    return false;
                }
            }
            return true;
        }
    }
}
