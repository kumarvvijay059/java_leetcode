public class odd_even_linked_list {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head==null || head.next==null)
            {
                return head;
            }
            ListNode ptrhead = head;
            ListNode temphead = head.next;
            ListNode ptr = ptrhead;
            ListNode temp = temphead;
            int count = 1;
            while(ptr.next!=null && temp.next!=null)
            {
                if(count%2==0)
                {
                    temp.next = ptr.next;
                    temp = ptr.next;
                    count++;
                }
                else
                {
                    ptr.next = temp.next;
                    ptr = temp.next;
                    count++;
                }
            }
            ptr.next = temphead;
            temp.next = null;
            return ptrhead;
        }
    }
}
