public class delete_node_in_a_linked_list {
     public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    class Solution {
        public void deleteNode(ListNode node) {
            ListNode temp = null;
            while(node.next!=null)
            {
                node.val = node.next.val;
                temp = node;
                node = node.next;
            }
            temp.next = null;
        }
    }
}
