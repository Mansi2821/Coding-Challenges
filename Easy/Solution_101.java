import java.util.*;
// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
// Example 1:
// Input: root = [1,2,2,3,4,4,3]
// Output: true
// Example 2:
// Input: root = [1,2,2,null,3,null,3]
// Output: false

// class Solution_101 {
//   public boolean isSymmetric(TreeNode root) {
//     return isSymmetric(root, root);
//   }

//   private boolean isSymmetric(TreeNode p, TreeNode q) {
//     if (p == null || q == null)
//       return p == q;

//     return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
//   }
// }