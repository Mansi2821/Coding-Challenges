// Given an integer array nums, handle multiple queries of the following type:

// Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
// Implement the NumArray class:

// NumArray(int[] nums) Initializes the object with the integer array nums.
// int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

// Example 1:

// Input
// ["NumArray", "sumRange", "sumRange", "sumRange"]
// [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
// Output
// [null, 1, -1, -3]


// class Solution_303 {
//   public NumArray(int[] nums) {
//     prefix = new int[nums.length + 1];
//     for (int i = 0; i < nums.length; ++i)
//       prefix[i + 1] = nums[i] + prefix[i];
//   }

//   public int sumRange(int left, int right) {
//     return prefix[right + 1] - prefix[left];
//   }

//   private int[] prefix;
// }