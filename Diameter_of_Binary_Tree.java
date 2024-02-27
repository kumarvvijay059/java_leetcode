import java.util.*;
import java.io.*;
import java.lang.*;
public class Diameter_of_Binary_Tree {

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
        public int diameterOfBinaryTree(TreeNode root) {
            int[] max = new int[1];
            fun(root , max);
            return max[0];
        }

        public static int fun(TreeNode root , int[] max)
        {
            if(root == null)
            {
                return 0;
            }
            int l = fun(root.left , max);
            int r = fun(root.right , max);
            int maxi = l+r;
            if(max[0]<maxi)
            {
                max[0] = maxi;
            }
            return 1 + Math.max(l , r);
        }
    }
}
