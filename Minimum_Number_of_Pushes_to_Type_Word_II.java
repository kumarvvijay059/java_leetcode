import java.util.*;
public class Minimum_Number_of_Pushes_to_Type_Word_II {
    // class Solution {

//     public class Pair
//     {
//         char c;
//         int freq;

//         public Pair(char c , int freq)
//         {
//             this.c = c;
//             this.freq = freq;
//         }
//     }

//     public int minimumPushes(String word)
//     {
//         int n = word.length();
//         int[] hashing = new int[26];
//         HashSet<Character> hs = new HashSet<>();
//         for(int i = 0 ; i<n ; i++)
//         {
//             hs.add(word.charAt(i));
//             hashing[word.charAt(i) - 'a']++;
//         }
//         Pair[] p = new Pair[hs.size()];
//         int ind = 0;
//         for(int i = 0 ; i<26 ; i++)
//         {
//             if(hashing[i]>0)
//             {
//                 p[ind] = new Pair((char)(i+97) , hashing[i]);
//                 ind++;
//             }
//         }
//         Arrays.sort(p , new Comparator<Pair>(){
//             public int compare(Pair p1 , Pair p2)
//             {
//                 return p2.freq - p1.freq;
//             }
//         });
//         int ans = 0;
//         for(int i = 0 ; i<p.length ; i++)
//         {
//             ans = ans + ((i/8)+1)*p[i].freq;
//         }
//         return ans;
//     }
// }

    class Solution {

        public int minimumPushes(String word)
        {
            int n = word.length();
            Integer[] hashing = new Integer[26];
            Arrays.fill(hashing, 0);
            for(int i = 0 ; i<n ; i++)
            {
                hashing[word.charAt(i) - 'a']++;
            }
            Arrays.sort(hashing , Collections.reverseOrder());
            int ans = 0;
            for(int i = 0 ; i<26 ; i++)
            {
                if(hashing[i]>0)
                {
                    ans = ans + ((i/8)+1)*hashing[i];
                }
            }
            return ans;
        }
    }
}
