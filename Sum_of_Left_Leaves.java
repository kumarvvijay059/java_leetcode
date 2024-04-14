import java.util.*;
import java.io.*;
import java.lang.*;
public class Sum_of_Left_Leaves {

     // Definition for a binary tree node.
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
        public int sumOfLeftLeaves(TreeNode root) {
            int ans = fun(root);
            return ans;
        }

        public int fun(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }
            int sum = 0;
            if(root.left != null && root.left.left == null && root.left.right == null)
            {
                sum = sum + root.left.val;
            }
            sum = sum + fun(root.left) + fun(root.right);
            return sum;
        }
    }
}
