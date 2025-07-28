// A fancy string is a string where no three consecutive characters are equal.

// Given a string s, delete the minimum possible number of characters from s to make it fancy.

// Return the final string after the deletion. It can be shown that the answer will always be unique.

 

// Example 1:

// Input: s = "leeetcode"
// Output: "leetcode"
// Explanation:
// Remove an 'e' from the first group of 'e's to create "leetcode".
// No three consecutive characters are equal, so return "leetcode".





class Solution_1957 {
  public String makeFancyString(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray())
      if (sb.length() < 2 || //
          sb.charAt(sb.length() - 1) != c || sb.charAt(sb.length() - 2) != c)
        sb.append(c);
    return sb.toString();
  }
}
