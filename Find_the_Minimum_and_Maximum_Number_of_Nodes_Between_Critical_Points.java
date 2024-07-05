import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points {

      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            int[] ans = new int[2];
            ListNode bef = head;
            ListNode curr = head.next;
            ListNode aft = head.next.next;
            int prev_i = -999999999;
            int i = 1;
            int min_diff = Integer.MAX_VALUE;;
            int count = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(aft != null)
            {
                if((bef.val<curr.val && curr.val>aft.val) || (bef.val>curr.val && curr.val<aft.val))
                {
                    if(min>i)
                    {
                        min = i;
                    }
                    if(max<i)
                    {
                        max = i;
                    }
                    int diff = i - prev_i;
                    prev_i = i;
                    if(min_diff>diff)
                    {
                        min_diff = diff;
                    }
                    count++;
                }
                bef = curr;
                curr = aft;
                aft = aft.next;
                i++;
            }
            if(count <= 1)
            {
                ans[0] = -1;
                ans[1] = -1;
                return ans;
            }
            ans[0] = min_diff;
            ans[1] = max - min;
            return ans;
        }
    }
}
