import java.util.*;
// import java.util.Collectors;

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

class Solution_128 {
  public int longestConsecutive(int[] nums) {
    int ans = 0;
    // Set<Integer> seen = Arrays.stream(nums).boxed().collect(Collectors.toSet());

    // for (int num : seen) {
    //   // `num` is the start of a sequence.
    //   if (seen.contains(num - 1))
    //     continue;
    //   int length = 1;
    //   while (seen.contains(++num))
    //     ++length;
    //   ans = Math.max(ans, length);
    // }

    return ans;
  }
}