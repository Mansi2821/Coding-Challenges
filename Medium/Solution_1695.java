import java.util.*;

// You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

// Return the maximum score you can get by erasing exactly one subarray.

// An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).

 

// Example 1:

// Input: nums = [4,2,4,5,6]
// Output: 17
// Explanation: The optimal subarray here is [2,4,5,6].

class Solution {
  public int maximumUniqueSubarray(int[] nums) {
    int ans = 0;
    int score = 0;
    Set<Integer> seen = new HashSet<>();

    for (int l = 0, r = 0; r < nums.length; ++r) {
      while (!seen.add(nums[r])) {
        score -= nums[l];
        seen.remove(nums[l++]);
      }
      score += nums[r];
      ans = Math.max(ans, score);
    }

    return ans;
  }
}