import java.io.*;
import java.util.*;
import java.lang.*;
public class Pseudo_Palindromic_Paths_in_a_Binary_Tree {

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
        public int pseudoPalindromicPaths (TreeNode root) {
            int[] hashing = new int[10];
            return traverse(root , hashing);
        }

        public int traverse(TreeNode root , int[] hashing)
        {
            if(root == null)
            {
                return 0;
            }
            if(root.left == null && root.right == null)
            {
                hashing[root.val]++;
                if(canPalindrome(hashing))
                {
                    hashing[root.val]--;
                    return 1;
                }
                else
                {
                    hashing[root.val]--;
                    return 0;
                }
            }
            else
            {
                hashing[root.val]++;
                int l = traverse(root.left , hashing);
                int r = traverse(root.right , hashing);
                hashing[root.val]--;
                return (l+r);
            }
        }

        public boolean canPalindrome(int[] hashing)
        {
            int count = 0;
            int sum = 0;
            for(int i = 1 ; i<10 ; i++)
            {
                sum = sum + hashing[i];
                if(hashing[i]%2==1)
                {
                    count++;
                }
            }
            if(sum%2==0 && count==0)
            {
                return true;
            }
            if(sum%2==1 && count==1)
            {
                return true;
            }
            return false;
        }
    }



// class Solution {
//     public int pseudoPalindromicPaths (TreeNode root) {
//         ArrayList<Integer> al = new ArrayList<>();
//         return traverse(root , al);
//     }

//     public int traverse(TreeNode root , ArrayList<Integer> al)
//     {
//         if(root == null)
//         {
//             return 0;
//         }
//         if(root.left == null && root.right == null)
//         {
//             al.add(root.val);
//             if(canPalindrome(al))
//             {
//                 al.remove(al.size() - 1);
//                 return 1;
//             }
//             else
//             {
//                 al.remove(al.size() - 1);
//                 return 0;
//             }
//         }
//         else
//         {
//             al.add(root.val);
//             int l = traverse(root.left , al);
//             int r = traverse(root.right , al);
//             al.remove(al.size() - 1);
//             return (l+r);
//         }
//     }

//     public boolean canPalindrome(ArrayList<Integer> al)
//     {
//         int[] hashing = new int[10];
//         int count = 0;
//         for(int ele : al)
//         {
//             hashing[ele]++;
//         }
//         for(int i = 1 ; i<10 ; i++)
//         {
//             if(hashing[i]%2==1)
//             {
//                 count++;
//             }
//         }
//         if(al.size()%2==0 && count==0)
//         {
//             return true;
//         }
//         if(al.size()%2==1 && count==1)
//         {
//             return true;
//         }
//         return false;
//     }
// }
}
