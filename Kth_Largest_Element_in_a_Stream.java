import java.util.*;
public class Kth_Largest_Element_in_a_Stream {
    class KthLargest {

        PriorityQueue<Integer> pq;
        int k;

        public KthLargest(int k, int[] nums)
        {
            this.k = k;
            pq = new PriorityQueue<>(k);
            for(int i =0 ; i<nums.length ; i++)
            {
                add(nums[i]);
            }
        }

        public int add(int val) {
            if(pq.size()<k)
            {
                pq.offer(val);
            }
            else if(pq.peek()<val)
            {
                pq.remove();
                pq.offer(val);
            }
            return pq.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
