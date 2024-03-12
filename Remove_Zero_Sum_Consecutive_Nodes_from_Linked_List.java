import java.util.*;
import java.io.*;
import java.lang.*;
public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    class Solution {
        public ListNode removeZeroSumSublists(ListNode head)
        {
            int prefixSum = 0;
            HashMap<Integer, ListNode> map = new HashMap<>();
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            map.put(0, dummy);
            while (head != null)
            {
                prefixSum += head.val;
                if (map.containsKey(prefixSum))
                {
                    ListNode start = map.get(prefixSum);
                    ListNode temp = start;
                    int sum = prefixSum;
                    while (temp != head)
                    {
                        temp = temp.next;
                        sum += temp.val;
                        if (temp != head)
                        {
                            map.remove(sum);
                        }
                    }
                    start.next = head.next;
                }
                else
                {
                    map.put(prefixSum, head);
                }
                head = head.next;
            }
            return dummy.next;
        }
    }

// class Solution {
//     public ListNode removeZeroSumSublists(ListNode head) {
//         ArrayList<Integer> al = new ArrayList<>();
//         ListNode start = head;
//         while(start!=null)
//         {
//             al.add(start.val);
//             start = start.next;
//         }
//         int[] arr = new int[al.size()];
//         for(int i = 0 ; i<al.size() ; i++)
//         {
//             arr[i] = al.get(i);
//         }
//         HashMap<Integer , Integer> hm = new HashMap<>();
//         int sum = 0;
//         for(int i = 0 ; i<arr.length ; i++)
//         {
//             sum = sum + arr[i];
//             if(sum == 0)
//             {
//                 for(int j = 0 ; j<=i ; j++)
//                 {
//                     arr[j] = 0;
//                 }
//                 hm.clear();
//             }
//             else if(hm.containsKey(sum))
//             {
//                 for(int j = hm.get(sum) + 1 ; j<=i ; j++)
//                 {
//                     arr[j] = 0;
//                 }
//                 hm.remove(sum);
//             }
//             else
//             {
//                 hm.put(sum , i);
//             }
//         }
//         ListNode temp = new ListNode(0);
//         ListNode curr = temp;
//         for(int i = 0 ; i<arr.length ; i++)
//         {
//             if(arr[i]!=0)
//             {
//                 curr.next = new ListNode(arr[i]);
//                 curr = curr.next;
//             }
//         }
//         return temp.next;
//     }
// }
}
