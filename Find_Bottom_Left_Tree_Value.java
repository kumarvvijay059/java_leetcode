import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_Bottom_Left_Tree_Value {

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
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int ans = 0;
            while(!q.isEmpty())
            {
                ans = q.peek().val;
                int siz = q.size();
                for(int i = 0 ; i<siz ; i++)
                {
                    TreeNode a = q.poll();
                    if(a.left!=null)
                    {
                        q.add(a.left);
                    }
                    if(a.right!=null)
                    {
                        q.add(a.right);
                    }
                }
            }
            return ans;
        }
    }
}
