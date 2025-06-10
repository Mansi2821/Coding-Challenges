// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Approach: Use a HashMap to find complements efficiently

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashmap.containsKey(complement)) {
                return new int[]{hashmap.get(complement), i};
            }
            hashmap.put(nums[i], i);
        }

        // If no solution is found (though the problem guarantees one)
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Output: [0, 1]
    }
}
