// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

 

// Example 1:

// Input: n = 16
// Output: true
// Example 2:

// Input: n = 5
// Output: false


class Solution_342 {
  public boolean isPowerOfFour(int n) {
    // Why (4^n - 1) % 3 == 0?
    // (4^n - 1) = (2^n - 1)(2^n + 1) and 2^n - 1, 2^n, 2^n + 1 are
    // three consecutive numbers; among one of them, there must be a multiple
    // of 3, and that can't be 2^n, so it must be either 2^n - 1 or 2^n + 1.
    // Therefore, 4^n - 1 is a multiple of 3
    return n > 0 && Integer.bitCount(n) == 1 && (n - 1) % 3 == 0;
  }
}


