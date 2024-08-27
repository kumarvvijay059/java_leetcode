import java.util.*;
public class Maximum_Points_You_Can_Obtain_from_Cards {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int n = cardPoints.length;
            int right_sum = 0;
            int left_sum = 0;
            for(int i = 0 ; i<k ; i++)
            {
                right_sum = right_sum + cardPoints[i];
            }
            int max_sum = left_sum + right_sum;
            int l = n-1;
            for(int r = k-1 ; r>=0 ; r--)
            {
                right_sum = right_sum - cardPoints[r];
                left_sum = left_sum + cardPoints[l];
                l--;
                int sum = left_sum + right_sum;
                max_sum = Math.max(max_sum , sum);
            }
            return max_sum;
        }
    }
}
