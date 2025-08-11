import java.util.*;

// Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 

// Example 1:


// Input: nums = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]
// Explanation: [0,-10,5,null,-3,null,9] is also accepted


// class Solution_108 {
//     public TreeNode sortedArrayToBST(int[] nums) {
//         return buildBST(nums, 0, nums.length - 1);
//     }
    
//     private TreeNode buildBST(int[] nums, int left, int right) {
//         if (left > right) {
//             return null;
//         }
        
//         int mid = left + (right - left) / 2;
//         TreeNode root = new TreeNode(nums[mid]);
//         root.left = buildBST(nums, left, mid - 1);
//         root.right = buildBST(nums, mid + 1, right);
        
//         return root;
//     }
// }