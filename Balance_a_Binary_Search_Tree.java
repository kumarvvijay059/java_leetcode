import java.util.*;
import java.lang.*;
import java.io.*;
public class Balance_a_Binary_Search_Tree {

    //  Definition for a binary tree node.
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
        public TreeNode balanceBST(TreeNode root) {
            ArrayList<Integer> l = new ArrayList<>();
            traverse(root , l);
            int[] arr = new int[l.size()];
            for(int i = 0 ; i<l.size() ; i++)
            {
                arr[i] = l.get(i);
            }
            Arrays.sort(arr);
            return makeBST(arr , 0 , arr.length - 1);

        }

        private void traverse(TreeNode root , ArrayList<Integer> l)
        {
            if(root != null)
            {
                l.add(root.val);
                traverse(root.left , l);
                traverse(root.right , l);
            }
        }

        private TreeNode makeBST(int[] arr , int l , int h)
        {
            if(l>h)
            {
                return null;
            }
            int mid = l + (h - l)/2;
            TreeNode node = new TreeNode(arr[mid]);
            node.left = makeBST(arr , l , mid-1);
            node.right = makeBST(arr , mid+1 , h);
            return node;
        }
    }
}
