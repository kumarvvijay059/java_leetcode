import java.util.*;
public class Longest_consecutive_subsequence_tcs_gfg {
    class Solution
    {
        // arr[] : the input array
        // N : size of the array arr[]

        //Function to return length of longest subsequence of consecutive integers.
        static int findLongestConseqSubseq(int arr[], int N)
        {
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int num : arr)
            {
                hs.add(num);
            }

            int longestStreak = 0;
            for(int num : arr)
            {
                if(!hs.contains(num-1))
                {
                    int currNum = num;
                    int currStreak = 1;

                    while(hs.contains(currNum+1))
                    {
                        currNum++;
                        currStreak++;
                    }
                    longestStreak = Math.max(longestStreak , currStreak);
                }
            }
            return longestStreak;
        }
    }
}
