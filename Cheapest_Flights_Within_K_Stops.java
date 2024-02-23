import java.util.*;
import java.io.*;
import java.lang.*;
public class Cheapest_Flights_Within_K_Stops {
    class Solution {
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            Map<Integer, List<int[]>> hm = new HashMap<>();
            for (int[] flight : flights) {
                hm.computeIfAbsent(flight[0], key -> new ArrayList<>()).add(new int[] {flight[1], flight[2]});
            }

            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;

            Queue<int[]> qu = new LinkedList<>();
            qu.offer(new int[] {src, 0});
            int stops = 0;

            while (!qu.isEmpty() && stops <= k) {
                int sz = qu.size();
                while (sz-- > 0) {
                    int[] curr = qu.poll();
                    int node = curr[0];
                    int distance = curr[1];

                    if (!hm.containsKey(node)) continue;

                    for (int[] next : hm.get(node)) {
                        int neighbour = next[0];
                        int price = next[1];
                        if (price + distance >= dist[neighbour]) continue;
                        dist[neighbour] = price + distance;
                        qu.offer(new int[] {neighbour, dist[neighbour]});
                    }
                }
                stops++;
            }

            return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
        }
    }
}
