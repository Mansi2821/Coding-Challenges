// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.

 

// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.



class Solution_905 {
  public int[] sortArrayByParity(int[] nums) {
    int l = 0;
    int r = nums.length - 1;

    while (l < r) {
      if (nums[l] % 2 == 1 && nums[r] % 2 == 0) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
      }
      if (nums[l] % 2 == 0)
        ++l;
      if (nums[r] % 2 == 1)
        --r;
    }

    return nums;
  }
}
