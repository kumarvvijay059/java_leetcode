import java.util.*;
import java.io.*;
import java.lang.*;
public class Reveal_Cards_In_Increasing_Order {
    class Solution {
        public int[] deckRevealedIncreasing(int[] deck) {
            int n = deck.length;
            Arrays.sort(deck);
            int[] ans = new int[n];
            Queue<Integer> d = new LinkedList<>();
            for(int i = 0 ; i<n ; i++)
            {
                d.add(i);
            }
            for(int card : deck)
            {
                int ind = d.poll();
                ans[ind] = card;
                if(!d.isEmpty())
                {
                    d.add(d.poll());
                }
            }
            return ans;
        }
    }
}
