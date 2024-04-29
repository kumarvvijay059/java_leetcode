public class palindrome_linked_list {
    //Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null)
            {
                return true;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next!=null && fast.next.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = reverse(slow.next);
            slow = slow.next;
            while(slow!=null)
            {
                if(head.val!=slow.val)
                {
                    return false;
                }
                head = head.next;
                slow = slow.next;
            }
            return true;
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
    }
}
