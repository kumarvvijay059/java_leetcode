import java.util.*;
import java.io.*;
import java.lang.*;
public class Time_Needed_to_Buy_Tickets {
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int n = tickets.length;
            int cnt = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(i<=k)
                {
                    cnt = cnt + Math.min(tickets[i] , tickets[k]);
                }
                else
                {
                    cnt = cnt + Math.min(tickets[i] , tickets[k] - 1);
                }
            }
            return cnt;
        }
    }
}
