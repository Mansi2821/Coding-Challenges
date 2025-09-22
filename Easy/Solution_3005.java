import java.util.*;
// You are given an array nums consisting of positive integers.
// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
// The frequency of an element is the number of occurrences of that element in the array.

// Example 1:

// Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.


class Solution_3005 {
  public int maxFrequencyElements(int[] nums) {
    final int MAX = 100;
    int ans = 0;
    int[] count = new int[MAX + 1];

    for (final int num : nums)
      ++count[num];

    final int maxFreq = Arrays.stream(count).max().getAsInt();

    for (final int freq : count)
      if (freq == maxFreq)
        ans += maxFreq;

    return ans;
  }
}