import java.util.*;
import java.lang.*;
import java.io.*;
public class Find_the_City_With_the_Smallest_Number_of_Neighbors_at_a_Threshold_Distance {
    class Solution {
        public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            int infinity = 1000000000;
            int[][] dist = new int[n][n];
            for(int i = 0 ; i<n ; i++)
            {
                for(int j = 0 ; j<n ; j++)
                {
                    if(i==j)
                    {
                        dist[i][j] = 0;
                    }
                    else
                    {
                        dist[i][j] = infinity;
                    }
                }
            }

            for(int[] e : edges)
            {
                int from = e[0];
                int to = e[1];
                int weight = e[2];
                dist[from][to] = weight;
                dist[to][from] = weight;
            }

            for(int k = 0 ; k<n ; k++)
            {
                for(int i = 0 ; i<n ; i++)
                {
                    for(int j = 0 ; j<n ; j++)
                    {
                        if(dist[i][k] + dist[k][j] < dist[i][j])
                        {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }

            int min = Integer.MAX_VALUE;
            int ans_city = -1;
            for(int i = 0 ; i<n ; i++)
            {
                int count = 0;
                for(int j = 0 ; j<n ; j++)
                {
                    if(i!=j && dist[i][j]<=distanceThreshold)
                    {
                        count++;
                    }
                }

                if(count<min)
                {
                    min = count;
                    ans_city = i;
                }
                else if(count == min)
                {
                    ans_city = Math.max(ans_city , i);
                }
            }

            return ans_city;
        }
    }
}
