import java.util.*;
// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

// Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

// Example 1:

// Input: s = "leetcode", wordDict = ["leet","code"]
// Output: true
// Explanation: Return true because "leetcode" can be segmented as "leet code".


class Solution_139 {
  public boolean wordBreak(String s, List<String> wordDict) {
    return wordBreak(s, new HashSet<>(wordDict), new HashMap<>());
  }

  private boolean wordBreak(final String s, Set<String> wordSet, Map<String, Boolean> mem) {
    if (mem.containsKey(s))
      return mem.get(s);
    if (wordSet.contains(s)) {
      mem.put(s, true);
      return true;
    }

    // 1 <= prefix.length() < s.length()
    for (int i = 1; i < s.length(); ++i) {
      final String prefix = s.substring(0, i);
      final String suffix = s.substring(i);
      if (wordSet.contains(prefix) && wordBreak(suffix, wordSet, mem)) {
        mem.put(s, true);
        return true;
      }
    }

    mem.put(s, false);
    return false;
  }
}