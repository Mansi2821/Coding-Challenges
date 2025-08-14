// You are given a string num representing a large integer. An integer is good if it meets the following conditions:

// It is a substring of num with length 3.
// It consists of only one unique digit.
// Return the maximum good integer as a string or an empty string "" if no such integer exists.

// Note:

// A substring is a contiguous sequence of characters within a string.
// There may be leading zeroes in num or a good integer.
 

// Example 1:

// Input: num = "6777133339"
// Output: "777"
// Explanation: There are two distinct good integers: "777" and "333".
// "777" is the largest, so we return "777".


class Solution_2264 {
  public String largestGoodInteger(String num) {
    String ans = "";

    for (int i = 2; i < num.length(); ++i)
      if (num.charAt(i - 2) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i) &&
          num.substring(i - 2, i + 1).compareTo(ans) > 0)
        ans = num.substring(i - 2, i + 1);

    return ans;
  }
}