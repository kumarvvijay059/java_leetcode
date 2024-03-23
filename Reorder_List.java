import java.util.*;
import java.io.*;
import java.lang.*;
public class Reorder_List {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public void reorderList(ListNode head) {
            if(head==null || head.next==null)
            {
                return;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode head2 = reverse(slow.next);
            slow.next = null;
            mergeAlternately(head , head2);
        }

        ListNode reverse(ListNode head)
        {
            ListNode before = null;
            ListNode after = null;
            while(head!=null)
            {
                after = head.next;
                head.next = before;
                before = head;
                head = after;
            }
            return before;
        }

        ListNode mergeAlternately(ListNode head1, ListNode head2) {
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            while (head1 != null && head2 != null)
            {
                current.next = head1;
                head1 = head1.next;
                current = current.next;

                current.next = head2;
                head2 = head2.next;
                current = current.next;
            }
            if (head1 != null)
            {
                current.next = head1;
            }
            if (head2 != null)
            {
                current.next = head2;
            }
            return dummy.next;
        }
    }
}
