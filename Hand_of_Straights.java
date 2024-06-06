import java.util.*;
import java.io.*;
import java.lang.*;
public class Hand_of_Straights {
    class Solution {
        public boolean isNStraightHand(int[] hand, int groupSize) {
            int n = hand.length;
            if(n%groupSize!=0)
            {
                return false;
            }
            Arrays.sort(hand);
            for(int i = 0 ; i<n ; i++)
            {
                if(hand[i]>=0)
                {
                    if(!help(hand , groupSize , i , n))
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean help(int[] hand , int groupSize , int i , int n)
        {
            int next = hand[i] + 1;
            hand[i]  = -1;
            int count = 1;
            i = i+1;
            while(i<n && count<groupSize)
            {
                if(hand[i] == next)
                {
                    next = hand[i] + 1;
                    hand[i] = -1;
                    count++;
                }
                i++;
            }
            if (count != groupSize)
            {
                return false;
            }
            else
            {
                return true;
            }

        }
    }
}
