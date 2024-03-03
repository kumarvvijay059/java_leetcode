public class remove_nth_node_from_end_of_linked_list {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // if(head.next==null)
            // {
            //     if(n==1)
            //     {
            //         head = null;
            //         return head;
            //     }
            // }
            ListNode start = new ListNode();
            start.next = head;
            ListNode temp = start;
            ListNode ptr = start;
            for(int i = 1 ; i<= n ; ++i)
            {
                temp = temp.next;
            }
            while(temp.next!=null)
            {
                ptr = ptr.next;
                temp = temp.next;
            }
            ptr.next = ptr.next.next;
            return start.next;
        }
    }
}
