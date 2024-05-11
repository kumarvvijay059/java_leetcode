import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Cost_to_Hire_K_Workers {
    class Solution {
        public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
            int n = wage.length;
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            List<Pair<Double , Integer>> ratio = new ArrayList<>();
            int qsum = 0;
            double res = Double.MAX_VALUE;
            double maxrate = 0.0;
            for(int i = 0 ; i<n ; i++)
            {
                ratio.add(new Pair<>((double) wage[i] / quality[i] , i));
            }
            ratio.sort(Comparator.comparingDouble(p -> p.getKey()));
            for(int i = 0 ; i<k ; i++)
            {
                qsum += quality[ratio.get(i).getValue()];
                maxrate = Math.max(maxrate, ratio.get(i).getKey());
                pq.offer(quality[ratio.get(i).getValue()]);
            }
            res = maxrate * qsum;
            for (int i = k; i <n; i++)
            {
                maxrate = Math.max(maxrate, ratio.get(i).getKey());
                qsum -= pq.poll();
                qsum += quality[ratio.get(i).getValue()];
                pq.offer(quality[ratio.get(i).getValue()]);
                res = Math.min(res, maxrate * qsum);
            }

            return res;
        }
    }
}
