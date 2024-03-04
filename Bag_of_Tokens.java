import java.util.*;
import java.io.*;
import java.lang.*;
public class Bag_of_Tokens {
    class Solution {
        public int bagOfTokensScore(int[] tokens, int power) {
            Arrays.sort(tokens);
            int l = 0;
            int r = tokens.length - 1;
            int score = 0;
            int max = 0;
            while(l<=r)
            {
                if(power>=tokens[l])
                {
                    score++;
                    power = power - tokens[l];
                    l++;
                    if(max < score)
                    {
                        max = score;
                    }
                }
                else if(score>0)
                {
                    power = power + tokens[r];
                    score--;
                    r--;
                }
                else
                {
                    break;
                }
            }
            return max;
        }
    }
}
