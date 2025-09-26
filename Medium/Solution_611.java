import java.util.Arrays;
// Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
// Example 1:
// Input: nums = [2,2,3,4]
// Output: 3
// Explanation: Valid combinations are: 
// 2,3,4 (using the first 2)
// 2,3,4 (using the second 2)
// 2,2,3
// Example 2:

// Input: nums = [4,2,3,4]
// Output: 4




class Solution_611 {
  public int triangleNumber(int[] nums) {
    if (nums.length < 3)
      return 0;

    int ans = 0;

    Arrays.sort(nums);

    for (int k = nums.length - 1; k > 1; --k) {
      int i = 0;
      int j = k - 1;
      while (i < j)
        if (nums[i] + nums[j] > nums[k]) {
          // (nums[i], nums[j], nums[k])
          // (nums[i + 1], nums[j], nums[k])
          // ...
          // (nums[j - 1], nums[j], nums[k])
          ans += j - i;
          --j;
        } else {
          ++i;
        }
    }

    return ans;
  }
}