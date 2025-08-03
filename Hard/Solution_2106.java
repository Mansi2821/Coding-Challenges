// Fruits are available at some positions on an infinite x-axis. You are given a 2D integer array fruits where fruits[i] = [positioni, amounti] depicts amounti fruits at the position positioni. fruits is already sorted by positioni in ascending order, and each positioni is unique.

// You are also given an integer startPos and an integer k. Initially, you are at the position startPos. From any position, you can either walk to the left or right. It takes one step to move one unit on the x-axis, and you can walk at most k steps in total. For every position you reach, you harvest all the fruits at that position, and the fruits will disappear from that position.

// Return the maximum total number of fruits you can harvest.

 

// Example 1:


// Input: fruits = [[2,8],[6,3],[8,6]], startPos = 5, k = 4
// Output: 9
// Explanation: 
// The optimal way is to:
// - Move right to position 6 and harvest 3 fruits
// - Move right to position 8 and harvest 6 fruits
// You moved 3 steps and harvested 3 + 6 = 9 fruits in total.



class Solution {
  public int maxTotalFruits(int[][] fruits, int startPos, int k) {
    final int maxRight = Math.max(startPos, fruits[fruits.length - 1][0]);
    int ans = 0;
    int[] amounts = new int[1 + maxRight];
    int[] prefix = new int[2 + maxRight];

    for (int[] f : fruits)
      amounts[f[0]] = f[1];

    for (int i = 0; i + 1 < prefix.length; ++i)
      prefix[i + 1] = prefix[i] + amounts[i];

    // Go right first.
    final int maxRightSteps = Math.min(maxRight - startPos, k);
    for (int rightSteps = 0; rightSteps <= maxRightSteps; ++rightSteps) {
      final int leftSteps = Math.max(0, k - 2 * rightSteps); // Turn left
      ans = Math.max(ans, getFruits(startPos, maxRight, leftSteps, rightSteps, prefix));
    }

    // Go left first.
    final int maxLeftSteps = Math.min(startPos, k);
    for (int leftSteps = 0; leftSteps <= maxLeftSteps; ++leftSteps) {
      final int rightSteps = Math.max(0, k - 2 * leftSteps); // Turn right
      ans = Math.max(ans, getFruits(startPos, maxRight, leftSteps, rightSteps, prefix));
    }

    return ans;
  }

  private int getFruits(int startPos, int maxRight, int leftSteps, int rightSteps, int[] prefix) {
    final int l = Math.max(0, startPos - leftSteps);
    final int r = Math.min(maxRight, startPos + rightSteps);
    return prefix[r + 1] - prefix[l];
  }
}