import java.util.*;
import java.io.*;
import java.lang.*;
public class Same_Tree {

      //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            return fun(p , q);
        }

        public static boolean fun(TreeNode p , TreeNode q)
        {
            if(p==null && q==null)
            {
                return true;
            }
            if(p!=null && q==null)
            {
                return false;
            }
            if(p==null && q!=null)
            {
                return false;
            }
            if(p.val == q.val)
            {
                return fun(p.left , q.left) && fun(p.right , q.right);
            }
            return false;
        }
    }
}
