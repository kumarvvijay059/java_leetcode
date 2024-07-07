import java.util.*;
import java.io.*;
import java.lang.*;
public class Water_Bottles {
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange)
        {
            int sum = numBottles;
            int emptyB = 0;
            while(numBottles>=1)
            {
                emptyB = emptyB + numBottles;
                numBottles = emptyB / numExchange;
                emptyB = emptyB % numExchange;
                sum = sum + numBottles;
            }
            return sum;
        }
    }
}
