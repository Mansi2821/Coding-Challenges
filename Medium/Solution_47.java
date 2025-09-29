import java.util.*;
// Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

// Example 1:
// Input: nums = [1,1,2]
// Output:
// [[1,1,2],
//  [1,2,1],
//  [2,1,1]]
// Example 2:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]



class Solution_47 {
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    dfs(nums, new boolean[nums.length], new ArrayList<>(), ans);
    return ans;
  }

  private void dfs(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> ans) {
    if (path.size() == nums.length) {
      ans.add(new ArrayList<>(path));
      return;
    }

    for (int i = 0; i < nums.length; ++i) {
      if (used[i])
        continue;
      if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
        continue;
      used[i] = true;
      path.add(nums[i]);
      dfs(nums, used, path, ans);
      path.remove(path.size() - 1);
      used[i] = false;
    }
  }
}