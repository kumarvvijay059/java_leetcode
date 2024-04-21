public class linked_list_cycle_2 {

     // Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head==null || head.next==null)
            {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            ListNode enter = head;
            while(fast.next!=null && fast.next.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast)
                {
                    while(slow!=enter)
                    {
                        slow = slow.next;
                        enter = enter.next;
                    }
                    return enter;
                }
            }
            return null;

        }
    }
}
