import java.util.*;
import java.io.*;
import java.lang.*;
public class Three_Consecutive_Odds {
    class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            int n = arr.length;
            int count = 0;
            for(int e : arr)
            {
                if(e%2 != 0)
                {
                    count++;
                }
                else
                {
                    count = 0;
                }

                if(count>=3)
                {
                    return true;
                }
            }
            return false;
        }
    }
}
