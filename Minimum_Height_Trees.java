import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Height_Trees {

    class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            List<Integer> result = new ArrayList<>();

            if (n == 1) {
                result.add(0);
                return result;
            }
            List<Set<Integer>> adjList = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                adjList.add(new HashSet<>());
            }
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
            LinkedList<Integer> leaves = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (adjList.get(i).size() == 1) {
                    leaves.add(i);
                }
            }
            while (n > 2) {
                int numLeaves = leaves.size();
                n -= numLeaves;
                for (int i = 0; i < numLeaves; i++) {
                    int leaf = leaves.removeFirst();
                    int neighbor = adjList.get(leaf).iterator().next();
                    adjList.get(neighbor).remove(leaf);
                    if (adjList.get(neighbor).size() == 1) {
                        leaves.add(neighbor);
                    }
                }
            }
            result.addAll(leaves);
            return result;
        }
    }


// class Solution {
//     public List<Integer> findMinHeightTrees(int n, int[][] edges)
//     {
//         List<Integer> ans = new ArrayList<>();
//         int minh = 99999999;
//         for(int i = 0 ; i<n ; i++)
//         {
//             int hg = height(i , edges);
//             if(minh>hg)
//             {
//                 ans.clear();
//                 ans.add(i);
//                 minh = hg;
//             }
//             else if(minh == hg)
//             {
//                 ans.add(i);
//             }
//         }
//         return ans;
//     }

//     public int height(int node , int[][] edges)
//     {
//         Queue<Pair<Integer , Integer>> q = new LinkedList<>();
//         HashSet<Integer> hs = new HashSet<>();
//         hs.add(node);
//         q.offer(new Pair<>(node , 0));
//         int maxh = 0;
//         while(!q.isEmpty())
//         {
//             Pair<Integer , Integer> p = q.poll();
//             int curr_node = p.getKey();
//             int ht = p.getValue();
//             if(maxh<ht)
//             {
//                 maxh = ht;
//             }
//             for(int i = 0 ; i<edges.length ; i++)
//             {
//                 if(edges[i][0] == curr_node)
//                 {
//                     if(!hs.contains(edges[i][1]))
//                     {
//                         q.offer(new Pair<>(edges[i][1] , ht+1));
//                         hs.add(edges[i][1]);
//                     }
//                 }
//                 if(edges[i][1] == curr_node)
//                 {
//                     if(!hs.contains(edges[i][0]))
//                     {
//                         q.offer(new Pair<>(edges[i][0] , ht+1));
//                         hs.add(edges[i][0]);
//                     }
//                 }
//             }
//         }
//         return maxh;
//     }
// }
}
