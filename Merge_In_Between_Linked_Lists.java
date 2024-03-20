import java.util.*;
import java.io.*;
import java.lang.*;
public class Merge_In_Between_Linked_Lists {

     // Definition for singly-linked list.
      public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode start = list1;
            for(int i = 0 ; i<a-1 ; i++)
            {
                start = start.next;
            }
            ListNode junc1 = start;
            for(int i = 0 ; i<b-a+2 ; i++)
            {
                start = start.next;
            }
            ListNode junc2 = start;
            ListNode start1 = list2;
            while(start1.next!=null)
            {
                start1 = start1.next;
            }
            junc1.next = list2;
            start1.next = junc2;
            return list1;
        }
    }
}
