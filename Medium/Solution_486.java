// You are given an integer array nums. Two players are playing a game with this array: player 1 and player 2.

// Player 1 and player 2 take turns, with player 1 starting first. Both players start the game with a score of 0. At each turn, the player takes one of the numbers from either end of the array (i.e., nums[0] or nums[nums.length - 1]) which reduces the size of the array by 1. The player adds the chosen number to their score. The game ends when there are no more elements in the array.

// Return true if Player 1 can win the game. If the scores of both players are equal, then player 1 is still the winner, and you should also return true. You may assume that both players are playing optimally.

 

// Example 1:

// Input: nums = [1,5,2]
// Output: false
// Explanation: Initially, player 1 can choose between 1 and 2. 
// If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2). 
// So, final score of player 1 is 1 + 2 = 3, and player 2 is 5. 
// Hence, player 1 will never be the winner and you need to return false.



class Solution_486 {
    // Store the input array globally for DFS access
    private int[] nums;
    // Memoization table to store calculated results for subproblems
    // dp[i][j] represents the maximum score difference the current player can achieve
    // when choosing from nums[i] to nums[j]
    private int[][] dp;

    /**
     * Determines if Player 1 can win or tie the game
     * @param nums Array of scores to choose from
     * @return true if Player 1 can win or tie, false otherwise
     */
    public boolean predictTheWinner(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        dp = new int[n][n];
      
        // Player 1 wins or ties if their score difference is non-negative
        return dfs(0, n - 1) >= 0;
    }

    /**
     * Recursively calculates the maximum score difference the current player can achieve
     * @param left Left boundary index of the current subarray
     * @param right Right boundary index of the current subarray
     * @return Maximum score difference (current player's score - opponent's score)
     */
    private int dfs(int left, int right) {
        // Base case: no elements left to choose
        if (left > right) {
            return 0;
        }
      
        // Return memoized result if already calculated
        if (dp[left][right] != 0) {
            return dp[left][right];
        }
      
        // Current player chooses between:
        // 1. Taking nums[left]: gain nums[left], opponent plays optimally on [left+1, right]
        // 2. Taking nums[right]: gain nums[right], opponent plays optimally on [left, right-1]
        // Since opponent also plays optimally, we subtract their best score
        int chooseLeft = nums[left] - dfs(left + 1, right);
        int chooseRight = nums[right] - dfs(left, right - 1);
      
        // Store and return the maximum score difference
        dp[left][right] = Math.max(chooseLeft, chooseRight);
        return dp[left][right];
    }
}