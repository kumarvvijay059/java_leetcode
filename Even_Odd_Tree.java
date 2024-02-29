import java.util.*;
import java.io.*;
import java.lang.*;
public class Even_Odd_Tree {

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
        public boolean isEvenOddTree(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int level = 0;
            while(!q.isEmpty())
            {
                int size = q.size();
                if(level%2==0)
                {
                    int max = 0;
                    for(int i = 0 ; i<size ; i++)
                    {
                        TreeNode temp = q.poll();
                        if(temp.val%2==0)
                        {
                            return false;
                        }
                        if(max>=temp.val)
                        {
                            return false;
                        }
                        max = temp.val;
                        if(temp.left!=null)
                        {
                            q.add(temp.left);
                        }
                        if(temp.right!=null)
                        {
                            q.add(temp.right);
                        }
                    }
                }
                else
                {
                    int min = 9999999;
                    for(int i = 0 ; i<size ; i++)
                    {
                        TreeNode temp = q.poll();
                        if(temp.val%2!=0)
                        {
                            return false;
                        }
                        if(min<=temp.val)
                        {
                            return false;
                        }
                        min = temp.val;
                        if(temp.left!=null)
                        {
                            q.add(temp.left);
                        }
                        if(temp.right!=null)
                        {
                            q.add(temp.right);
                        }
                    }
                }
                level++;
            }
            return true;
        }
    }
}
