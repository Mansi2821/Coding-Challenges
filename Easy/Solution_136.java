// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

class Solution_136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR each number
        }
        return result;
    }
}

// Key Idea: XOR Bit Manipulation
// The XOR of a number with itself is 0: a ^ a = 0

// The XOR of a number with 0 is the number itself: a ^ 0 = a

// XOR is commutative and associative, so the order doesn’t matter.

// If you XOR all numbers, the ones that appear twice will cancel out and the
// one that appears once will remain.
