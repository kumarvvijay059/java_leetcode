public class middle_of_the_linked_list {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode middleNode(ListNode head) {
//            ListNode ptr = head;
//            int count = 1;
//            int ele = 0;
//            int ans = 0;
//            while(ptr.next!=null)
//            {
//                count++;
//                ptr = ptr.next;
//            }
//            if(count%2==1)
//            {
//                ele = (count + 1)/2;
//            }
//            else
//            {
//                ele = count/2 + 1;
//            }
//            ptr = head;
//            while(ele - 1>0)
//            {
//                ptr = ptr.next;
//                ele--;
//            }
//            return ptr;
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
